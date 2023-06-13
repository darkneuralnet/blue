package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/LinkAnnotation;", "", "url", "", "start", "", "end", "(Ljava/lang/String;II)V", "getEnd", "()I", "getStart", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.LinkAnnotation */
/* loaded from: classes7.dex */
public final class LinkAnnotation {
    private final int end;
    private final int start;
    private final String url;

    public LinkAnnotation(String url, int i, int i2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.start = i;
        this.end = i2;
    }

    public static /* synthetic */ LinkAnnotation copy$default(LinkAnnotation linkAnnotation, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = linkAnnotation.url;
        }
        if ((i3 & 2) != 0) {
            i = linkAnnotation.start;
        }
        if ((i3 & 4) != 0) {
            i2 = linkAnnotation.end;
        }
        return linkAnnotation.copy(str, i, i2);
    }

    public final String component1() {
        return this.url;
    }

    public final int component2() {
        return this.start;
    }

    public final int component3() {
        return this.end;
    }

    public final LinkAnnotation copy(String url, int i, int i2) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new LinkAnnotation(url, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkAnnotation) {
            LinkAnnotation linkAnnotation = (LinkAnnotation) obj;
            return Intrinsics.areEqual(this.url, linkAnnotation.url) && this.start == linkAnnotation.start && this.end == linkAnnotation.end;
        }
        return false;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.url.hashCode() * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end);
    }

    public String toString() {
        String str = this.url;
        int i = this.start;
        int i2 = this.end;
        return "LinkAnnotation(url=" + str + ", start=" + i + ", end=" + i2 + ")";
    }
}
