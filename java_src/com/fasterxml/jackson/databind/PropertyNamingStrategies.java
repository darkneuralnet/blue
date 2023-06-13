package com.fasterxml.jackson.databind;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.io.Serializable;
/* loaded from: classes5.dex */
public abstract class PropertyNamingStrategies implements Serializable {
    private static final long serialVersionUID = 2;
    public static final PropertyNamingStrategy LOWER_CAMEL_CASE = new LowerCamelCaseStrategy();
    public static final PropertyNamingStrategy UPPER_CAMEL_CASE = new UpperCamelCaseStrategy();
    public static final PropertyNamingStrategy SNAKE_CASE = new SnakeCaseStrategy();
    public static final PropertyNamingStrategy UPPER_SNAKE_CASE = new UpperSnakeCaseStrategy();
    public static final PropertyNamingStrategy LOWER_CASE = new LowerCaseStrategy();
    public static final PropertyNamingStrategy KEBAB_CASE = new KebabCaseStrategy();
    public static final PropertyNamingStrategy LOWER_DOT_CASE = new LowerDotCaseStrategy();

    /* loaded from: classes5.dex */
    public static class KebabCaseStrategy extends NamingBase {
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategies.NamingBase
        public String translate(String str) {
            return translateLowerCaseWithSeparator(str, CoreConstants.DASH_CHAR);
        }
    }

    /* loaded from: classes5.dex */
    public static class LowerCamelCaseStrategy extends NamingBase {
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategies.NamingBase
        public String translate(String str) {
            return str;
        }
    }

    /* loaded from: classes5.dex */
    public static class LowerCaseStrategy extends NamingBase {
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategies.NamingBase
        public String translate(String str) {
            return str.toLowerCase();
        }
    }

    /* loaded from: classes5.dex */
    public static class LowerDotCaseStrategy extends NamingBase {
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategies.NamingBase
        public String translate(String str) {
            return translateLowerCaseWithSeparator(str, CoreConstants.DOT);
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class NamingBase extends PropertyNamingStrategy {
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String nameForConstructorParameter(MapperConfig<?> mapperConfig, AnnotatedParameter annotatedParameter, String str) {
            return translate(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String nameForField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, String str) {
            return translate(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String nameForGetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
            return translate(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String nameForSetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
            return translate(str);
        }

        public abstract String translate(String str);

        public String translateLowerCaseWithSeparator(String str, char c) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            if (length == 0) {
                return str;
            }
            StringBuilder sb = new StringBuilder((length >> 1) + length);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                char lowerCase = Character.toLowerCase(charAt);
                if (lowerCase == charAt) {
                    if (i > 1) {
                        sb.insert(sb.length() - 1, c);
                    }
                    i = 0;
                } else {
                    if (i == 0 && i2 > 0) {
                        sb.append(c);
                    }
                    i++;
                }
                sb.append(lowerCase);
            }
            return sb.toString();
        }
    }

    /* loaded from: classes5.dex */
    public static class SnakeCaseStrategy extends NamingBase {
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategies.NamingBase
        public String translate(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb = new StringBuilder(length * 2);
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (i2 > 0 || charAt != '_') {
                    if (Character.isUpperCase(charAt)) {
                        if (!z && i > 0 && sb.charAt(i - 1) != '_') {
                            sb.append('_');
                            i++;
                        }
                        charAt = Character.toLowerCase(charAt);
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(charAt);
                    i++;
                }
            }
            if (i > 0) {
                return sb.toString();
            }
            return str;
        }
    }

    /* loaded from: classes5.dex */
    public static class UpperCamelCaseStrategy extends NamingBase {
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategies.NamingBase
        public String translate(String str) {
            if (str != null && !str.isEmpty()) {
                char charAt = str.charAt(0);
                char upperCase = Character.toUpperCase(charAt);
                if (charAt == upperCase) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(str);
                sb.setCharAt(0, upperCase);
                return sb.toString();
            }
            return str;
        }
    }

    /* loaded from: classes5.dex */
    public static class UpperSnakeCaseStrategy extends SnakeCaseStrategy {
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy, com.fasterxml.jackson.databind.PropertyNamingStrategies.NamingBase
        public String translate(String str) {
            if (super.translate(str) == null) {
                return null;
            }
            return super.translate(str).toUpperCase();
        }
    }
}
