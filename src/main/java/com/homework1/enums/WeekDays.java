package com.homework1.enums;

 

public enum WeekDays {

    /*  MONDAY {
          public String getDay() {
              return "TUESDAY";
          }
      },  TUESDAY {
          public String getDay() {
              return " WEDNESDAY";
          }
      },  WEDNESDAY {
          public String getDay() {
              return "THURSDAY";
          }
      },  THURSDAY {
          public String getDay() {
              return " FRIDAY";
          }
      },   FRIDAY {
          public String getDay() {
              return "SATURDAY";
          }
      }, SATURDAY {
          public String getDay() {
              return " SUNDAY";
          }
      }, SUNDAY {
          public String getDay() {
              return "MONDAY";
          }
      };
  */
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    private static WeekDays[] vals = values();
    public static WeekDays next(int i)
    {
        if(i == 6){
            return vals[0];
        } else
            return vals[(i+1) % vals.length];
    }

//    public abstract String getDay();
}