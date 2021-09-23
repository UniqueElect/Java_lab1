
public class Task7 {
    static class User {
        public int Age;
        public String firstname;
        public String lastname;
        public String email;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            User user = (User) o;

            if (Age != user.Age) return false;
            if (firstname != null ? !firstname.equals(user.firstname) : user.firstname != null) return false;
            if (lastname != null ? !lastname.equals(user.lastname) : user.lastname != null) return false;
            return email != null ? email.equals(user.email) : user.email == null;
        }

        @Override
        public int hashCode() {
            int result = Age;
            result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
            result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
            result = 31 * result + (email != null ? email.hashCode() : 0);
            return result;
        }
    }

    public static void main(String[] args) {

        User us = new User();
        User us1 = new User();
        User us2 = new User();

        us2.Age = 18;
        us1.Age = 19;
        us.Age = 18;

        System.out.println(us2.equals(us));
        System.out.println(us1.equals(us));

        System.out.println(us.hashCode());
        System.out.println(us1.hashCode());
        System.out.println(us2.hashCode());

    }
}