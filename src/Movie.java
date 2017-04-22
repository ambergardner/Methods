class Main {
    public static void main(String[] args) {
    }


/* A movie is a filmed
feature used as entertainment.
 */
    class Movie {

        String title;
        char rating;
        boolean isHorror = false;
        double length; //duration in minutes
        int dayOfweek;


        public Movie(String title, char rating, boolean isHorror, double length, int dayOfweek) {
            this.title = title;
            this.rating = rating;
            this.isHorror = isHorror;
            this.length = length;
            this.dayOfweek = dayOfweek;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public char getRating() {
            return rating;
        }

        public void setRating(char rating) {
            this.rating = rating;
        }

        public boolean isHorror() {
            return isHorror;
        }

        public void setHorror(boolean isHorror) {
            if (isHorror) {
                System.out.println("do not watch!");
            } else {
                this.isHorror = isHorror;
            }
        }

        public double getLength() {
            return length;
        }

        // criteria is no movie greater than 120 minutes
        public void setLength(double length) {
            if (length >= 120) {
                System.out.println("do not watch!");

            }
            this.length = length;
        }

        public int getDayOfweek() {
            return dayOfweek;
        }

        public void setDayOfweek(int dayOfweek) {
            this.dayOfweek = dayOfweek;
        }
    }
}
