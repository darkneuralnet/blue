package co.bird.android.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/* loaded from: classes4.dex */
public class GeometryTokenizer {
    public static String removeLeadingAndTrailingStrings(String str, String str2, String str3) {
        int length;
        int indexOf = str.indexOf(str2);
        if (indexOf == -1) {
            length = 0;
        } else {
            length = str2.length() + indexOf;
        }
        int lastIndexOf = str.lastIndexOf(str3);
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        return str.substring(length, lastIndexOf);
    }

    public static List<String> tokenize(String str, char c) {
        ArrayList arrayList = new ArrayList();
        Stack stack = new Stack();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '(' && charAt != '[') {
                if ((charAt == ')' && ((Character) stack.peek()).charValue() == '(') || (charAt == ']' && ((Character) stack.peek()).charValue() == '[')) {
                    stack.pop();
                }
            } else {
                stack.push(Character.valueOf(charAt));
            }
            if (charAt == c && stack.size() == 0) {
                arrayList.add(str.substring(i, i2));
                i = i2 + 1;
            }
        }
        if (i < str.length()) {
            arrayList.add(str.substring(i));
        }
        return arrayList;
    }
}
