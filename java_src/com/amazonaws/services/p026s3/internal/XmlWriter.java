package com.amazonaws.services.p026s3.internal;

import com.amazonaws.util.StringUtils;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.amazonaws.services.s3.internal.XmlWriter */
/* loaded from: classes3.dex */
public class XmlWriter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    List<String> tags = new ArrayList();

    /* renamed from: sb */
    StringBuilder f68584sb = new StringBuilder();

    private void appendEscapedString(String str, StringBuilder sb) {
        String str2;
        if (str == null) {
            str = "";
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != '\t') {
                if (charAt != '\n') {
                    if (charAt != '\r') {
                        if (charAt != '\"') {
                            if (charAt != '&') {
                                if (charAt != '<') {
                                    if (charAt != '>') {
                                        str2 = null;
                                    } else {
                                        str2 = "&gt;";
                                    }
                                } else {
                                    str2 = "&lt;";
                                }
                            } else {
                                str2 = "&amp;";
                            }
                        } else {
                            str2 = "&quot;";
                        }
                    } else {
                        str2 = "&#13;";
                    }
                } else {
                    str2 = "&#10;";
                }
            } else {
                str2 = "&#9;";
            }
            if (str2 != null) {
                if (i2 < i) {
                    sb.append((CharSequence) str, i2, i);
                }
                this.f68584sb.append(str2);
                i2 = i + 1;
            }
            i++;
        }
        if (i2 < i) {
            this.f68584sb.append((CharSequence) str, i2, i);
        }
    }

    private void writeAttr(String str, String str2) {
        StringBuilder sb = this.f68584sb;
        sb.append(' ');
        sb.append(str);
        sb.append("=\"");
        appendEscapedString(str2, this.f68584sb);
        this.f68584sb.append("\"");
    }

    public XmlWriter end() {
        List<String> list = this.tags;
        StringBuilder sb = this.f68584sb;
        sb.append("</");
        sb.append(list.remove(list.size() - 1));
        sb.append(">");
        return this;
    }

    public byte[] getBytes() {
        return toString().getBytes(StringUtils.UTF8);
    }

    public XmlWriter start(String str) {
        StringBuilder sb = this.f68584sb;
        sb.append("<");
        sb.append(str);
        sb.append(">");
        this.tags.add(str);
        return this;
    }

    public String toString() {
        return this.f68584sb.toString();
    }

    public XmlWriter value(String str) {
        appendEscapedString(str, this.f68584sb);
        return this;
    }

    public XmlWriter start(String str, String str2, String str3) {
        StringBuilder sb = this.f68584sb;
        sb.append("<");
        sb.append(str);
        writeAttr(str2, str3);
        this.f68584sb.append(">");
        this.tags.add(str);
        return this;
    }

    public XmlWriter start(String str, String[] strArr, String[] strArr2) {
        StringBuilder sb = this.f68584sb;
        sb.append("<");
        sb.append(str);
        for (int i = 0; i < Math.min(strArr.length, strArr2.length); i++) {
            writeAttr(strArr[i], strArr2[i]);
        }
        this.f68584sb.append(">");
        this.tags.add(str);
        return this;
    }
}
