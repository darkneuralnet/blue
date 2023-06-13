package p000;

import androidx.recyclerview.widget.C11925l;
/* renamed from: bM6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC38504bM6 {
    GET_REQUEST_STARTED(50),
    GET_REQUEST_ERROR(51),
    GET_REQUEST_SUCCEEDED(52),
    POST_REQUEST_STARTED(53),
    POST_REQUEST_ERROR(54),
    POST_REQUEST_SUCCEEDED(55),
    HTTP_STATUS_FAILED(-1),
    HTTP_STATUS_200(C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION);
    

    /* renamed from: b */
    public final int f57355b;

    EnumC38504bM6(int i) {
        this.f57355b = i;
    }

    /* renamed from: b */
    public static EnumC38504bM6 m64629b(int i) {
        EnumC38504bM6 enumC38504bM6 = GET_REQUEST_STARTED;
        if (i == enumC38504bM6.m64630a()) {
            return enumC38504bM6;
        }
        EnumC38504bM6 enumC38504bM62 = GET_REQUEST_ERROR;
        if (i == enumC38504bM62.m64630a()) {
            return enumC38504bM62;
        }
        EnumC38504bM6 enumC38504bM63 = GET_REQUEST_SUCCEEDED;
        if (i == enumC38504bM63.m64630a()) {
            return enumC38504bM63;
        }
        EnumC38504bM6 enumC38504bM64 = POST_REQUEST_STARTED;
        if (i == enumC38504bM64.m64630a()) {
            return enumC38504bM64;
        }
        EnumC38504bM6 enumC38504bM65 = POST_REQUEST_ERROR;
        if (i == enumC38504bM65.m64630a()) {
            return enumC38504bM65;
        }
        EnumC38504bM6 enumC38504bM66 = POST_REQUEST_SUCCEEDED;
        if (i == enumC38504bM66.m64630a()) {
            return enumC38504bM66;
        }
        EnumC38504bM6 enumC38504bM67 = HTTP_STATUS_FAILED;
        if (i == enumC38504bM67.m64630a()) {
            return enumC38504bM67;
        }
        EnumC38504bM6 enumC38504bM68 = HTTP_STATUS_200;
        if (i == enumC38504bM68.m64630a()) {
            return enumC38504bM68;
        }
        return null;
    }

    /* renamed from: a */
    public int m64630a() {
        return this.f57355b;
    }
}
