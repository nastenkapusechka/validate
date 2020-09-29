package org.example.validation.analyzers.email;

import org.example.validation.annotaions.CardNumber;
import org.example.validation.annotaions.Email;

import java.util.List;
import java.util.Set;

/**
 * This will be a stub class for tests.
 * We will use its fields to pass to methods
 */

public class PlugClass {

    @Email
    int intDigits;

    @Email
    long longDigits;

    @Email
    long[] arrayDigits;

    @Email
    String string;

    @Email
    String[] strings;

    @Email
    Object object;

    @Email
    List<?> list;

    @Email
    Set<?> set;

    public static class Builder {

        PlugClass cls;

        public Builder() {

            this.cls = new PlugClass();

        }

        public Builder withIntDigits(int val) {
            cls.intDigits = val;
            return this;
        }

        public Builder withLongDigits(long val) {
            cls.longDigits = val;
            return this;
        }

        public Builder withArrayDigits(long ... array) {
            cls.arrayDigits = array;
            return this;
        }

        public Builder withString(String val) {
            cls.string = val;
            return this;
        }

        public Builder withStrings(String ... val) {
            cls.strings = val;
            return this;
        }

        public Builder withObject(Object val) {
            cls.object = val;
            return this;
        }

        public Builder withList(List<?> val) {
            cls.list = val;
            return this;
        }

        public Builder withSet(Set<?> val) {
            cls.set = val;
            return this;
        }

        public PlugClass build() {
            return cls;
        }
    }
}