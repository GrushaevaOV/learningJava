package builder;

public class Cat {
    public String nameCat;
    public int year = 10000000;
    public String color;

    private Cat() {
    }

    public String getNameCat() {
        return nameCat;
    }


    public int getYear() {
        return year;
    }


    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "nameCat='" + nameCat  +
                ", year=" + year +
                ", color='" + color;
    }

    public static Builder newBuilder() {
        return new Cat().new Builder();
    }


    public class Builder {

        private Builder() {
        }

        public Builder setNameCat(String name) {
            Cat.this.nameCat = name;
            return this;
        }

        public Builder setYear(int year) {
            Cat.this.year = year;

            return this;
        }

        public Builder setColor(String color) {
            Cat.this.color = color;

            return this;
        }

        public Cat build() {
            return Cat.this;
        }

    }
}
