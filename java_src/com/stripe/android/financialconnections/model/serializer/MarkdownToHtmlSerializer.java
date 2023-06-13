package com.stripe.android.financialconnections.model.serializer;

import com.stripe.android.financialconnections.features.MarkdownParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.E24;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;", "LKj2;", "", "Lrb1;", "encoder", "value", "", "serialize", "LGV0;", "decoder", "deserialize", "LMs5;", "descriptor", "LMs5;", "getDescriptor", "()LMs5;", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class MarkdownToHtmlSerializer implements InterfaceC34036Kj2<String> {
    public static final MarkdownToHtmlSerializer INSTANCE = new MarkdownToHtmlSerializer();
    private static final InterfaceC34588Ms5 descriptor = C35524Qs5.m87852a("MarkdownToHtml", E24.C1721i.f6873a);

    private MarkdownToHtmlSerializer() {
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.E01
    public String deserialize(GV0 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return MarkdownParser.INSTANCE.toHtml$financial_connections_release(decoder.mo3282t());
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, String value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.mo1134q(value);
    }
}
