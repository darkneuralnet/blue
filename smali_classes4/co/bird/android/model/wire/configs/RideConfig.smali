.class public final Lco/bird/android/model/wire/configs/RideConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0006\n\u0002\u0008,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\u0008\u00c5\u0001\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0083\u0007\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000e\u0012\u0010\u0008\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001f\u0012\u0008\u0008\u0002\u0010 \u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010!\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\"\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010#\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010$\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010%\u001a\u00020&\u0012\u0008\u0008\u0002\u0010\'\u001a\u00020&\u0012\u0008\u0008\u0002\u0010(\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010)\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010*\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010+\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010/\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u00100\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u00101\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u00102\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u00103\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u00104\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u00105\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u00106\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u00107\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u00108\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u00109\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010:\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010;\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010<\u001a\u00020\u000e\u0012\u000e\u0008\u0002\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0014\u0012\u0008\u0008\u0002\u0010>\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010?\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010@\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010A\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010B\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010C\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010D\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010E\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010F\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010G\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010H\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010I\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010J\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010K\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010L\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010M\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010N\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010O\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010P\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010Q\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010R\u001a\u00020S\u0012\u0008\u0008\u0002\u0010T\u001a\u00020U\u0012\u0008\u0008\u0002\u0010V\u001a\u00020W\u0012\u0008\u0008\u0002\u0010X\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010Y\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010Z\u001a\u00020[\u0012\u0008\u0008\u0002\u0010\\\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010]\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010^\u001a\u00020_\u0012\n\u0008\u0002\u0010`\u001a\u0004\u0018\u00010a\u0012\u0008\u0008\u0002\u0010b\u001a\u00020c\u0012\u0008\u0008\u0002\u0010d\u001a\u00020e\u0012\u0008\u0008\u0002\u0010f\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010g\u001a\u00020\u000e\u00a2\u0006\u0002\u0010hJ\n\u0010\u00d0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00d1\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00d2\u0001\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u00d3\u0001\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u00d4\u0001\u001a\u00020\u000eH\u00c6\u0003J\u0012\u0010\u00d5\u0001\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u00c6\u0003J\n\u0010\u00d6\u0001\u001a\u00020\u0003H\u00c6\u0003J\u000c\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\n\u0010\u00d8\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00d9\u0001\u001a\u00020\u000eH\u00c6\u0003J\u000c\u0010\u00da\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\n\u0010\u00db\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00dc\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00dd\u0001\u001a\u00020\u000cH\u00c6\u0003J\u000c\u0010\u00de\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\n\u0010\u00df\u0001\u001a\u00020\u001fH\u00c6\u0003J\n\u0010\u00e0\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00e1\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00e2\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00e3\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00e4\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00e5\u0001\u001a\u00020&H\u00c6\u0003J\n\u0010\u00e6\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00e7\u0001\u001a\u00020&H\u00c6\u0003J\n\u0010\u00e8\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00e9\u0001\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u00ea\u0001\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u00eb\u0001\u001a\u00020\u000eH\u00c6\u0003J\u000c\u0010\u00ec\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000c\u0010\u00ed\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000c\u0010\u00ee\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\n\u0010\u00ef\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00f0\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00f1\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00f2\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00f3\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00f4\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00f5\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00f6\u0001\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u00f7\u0001\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u00f8\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00f9\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00fa\u0001\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u00fb\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00fc\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00fd\u0001\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u00fe\u0001\u001a\u00020\u000eH\u00c6\u0003J\u0010\u0010\u00ff\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0014H\u00c6\u0003J\n\u0010\u0080\u0002\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u0081\u0002\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u0082\u0002\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u0083\u0002\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u0084\u0002\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u0085\u0002\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u0086\u0002\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u0087\u0002\u001a\u00020\u0003H\u00c6\u0003J\u000c\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\n\u0010\u0089\u0002\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u008a\u0002\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u008b\u0002\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u008c\u0002\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u008d\u0002\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u008e\u0002\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u008f\u0002\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u0090\u0002\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u0091\u0002\u001a\u00020\u000eH\u00c6\u0003J\u000c\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\n\u0010\u0093\u0002\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u0094\u0002\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u0095\u0002\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u0096\u0002\u001a\u00020SH\u00c6\u0003J\n\u0010\u0097\u0002\u001a\u00020UH\u00c6\u0003J\n\u0010\u0098\u0002\u001a\u00020WH\u00c6\u0003J\n\u0010\u0099\u0002\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u009a\u0002\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u009b\u0002\u001a\u00020[H\u00c6\u0003J\n\u0010\u009c\u0002\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u009d\u0002\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u009e\u0002\u001a\u00020\u000eH\u00c6\u0003J\n\u0010\u009f\u0002\u001a\u00020_H\u00c6\u0003J\u000c\u0010\u00a0\u0002\u001a\u0004\u0018\u00010aH\u00c6\u0003J\n\u0010\u00a1\u0002\u001a\u00020cH\u00c6\u0003J\n\u0010\u00a2\u0002\u001a\u00020eH\u00c6\u0003J\n\u0010\u00a3\u0002\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u00a4\u0002\u001a\u00020\u000eH\u00c6\u0003J\u0011\u0010\u00a5\u0002\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010|J\u008e\u0007\u0010\u00a6\u0002\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000e2\u0010\u0008\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00032\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u000e2\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u000c2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001f2\u0008\u0008\u0002\u0010 \u001a\u00020\u000e2\u0008\u0008\u0002\u0010!\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\"\u001a\u00020\u000e2\u0008\u0008\u0002\u0010#\u001a\u00020\u000e2\u0008\u0008\u0002\u0010$\u001a\u00020\u000e2\u0008\u0008\u0002\u0010%\u001a\u00020&2\u0008\u0008\u0002\u0010\'\u001a\u00020&2\u0008\u0008\u0002\u0010(\u001a\u00020\u000e2\u0008\u0008\u0002\u0010)\u001a\u00020\u000c2\u0008\u0008\u0002\u0010*\u001a\u00020\u000c2\u0008\u0008\u0002\u0010+\u001a\u00020\u000e2\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010/\u001a\u00020\u000e2\u0008\u0008\u0002\u00100\u001a\u00020\u000e2\u0008\u0008\u0002\u00101\u001a\u00020\u000e2\u0008\u0008\u0002\u00102\u001a\u00020\u000e2\u0008\u0008\u0002\u00103\u001a\u00020\u000e2\u0008\u0008\u0002\u00104\u001a\u00020\u000e2\u0008\u0008\u0002\u00105\u001a\u00020\u000c2\u0008\u0008\u0002\u00106\u001a\u00020\u000c2\u0008\u0008\u0002\u00107\u001a\u00020\u000e2\u0008\u0008\u0002\u00108\u001a\u00020\u000e2\u0008\u0008\u0002\u00109\u001a\u00020\u000c2\u0008\u0008\u0002\u0010:\u001a\u00020\u000e2\u0008\u0008\u0002\u0010;\u001a\u00020\u000e2\u0008\u0008\u0002\u0010<\u001a\u00020\u000e2\u000e\u0008\u0002\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00142\u0008\u0008\u0002\u0010>\u001a\u00020\u000e2\u0008\u0008\u0002\u0010?\u001a\u00020\u000e2\u0008\u0008\u0002\u0010@\u001a\u00020\u000e2\u0008\u0008\u0002\u0010A\u001a\u00020\u000e2\u0008\u0008\u0002\u0010B\u001a\u00020\u000c2\u0008\u0008\u0002\u0010C\u001a\u00020\u000c2\u0008\u0008\u0002\u0010D\u001a\u00020\u000c2\n\u0008\u0002\u0010E\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010F\u001a\u00020\u000e2\u0008\u0008\u0002\u0010G\u001a\u00020\u000e2\u0008\u0008\u0002\u0010H\u001a\u00020\u000e2\u0008\u0008\u0002\u0010I\u001a\u00020\u000e2\u0008\u0008\u0002\u0010J\u001a\u00020\u000e2\u0008\u0008\u0002\u0010K\u001a\u00020\u000c2\u0008\u0008\u0002\u0010L\u001a\u00020\u000c2\u0008\u0008\u0002\u0010M\u001a\u00020\u000e2\u0008\u0008\u0002\u0010N\u001a\u00020\u000e2\u0008\u0008\u0002\u0010O\u001a\u00020\u000e2\u0008\u0008\u0002\u0010P\u001a\u00020\u000c2\u0008\u0008\u0002\u0010Q\u001a\u00020\u000c2\u0008\u0008\u0002\u0010R\u001a\u00020S2\u0008\u0008\u0002\u0010T\u001a\u00020U2\u0008\u0008\u0002\u0010V\u001a\u00020W2\u0008\u0008\u0002\u0010X\u001a\u00020\u000e2\u0008\u0008\u0002\u0010Y\u001a\u00020\u000e2\u0008\u0008\u0002\u0010Z\u001a\u00020[2\u0008\u0008\u0002\u0010\\\u001a\u00020\u000e2\u0008\u0008\u0002\u0010]\u001a\u00020\u000e2\u0008\u0008\u0002\u0010^\u001a\u00020_2\n\u0008\u0002\u0010`\u001a\u0004\u0018\u00010a2\u0008\u0008\u0002\u0010b\u001a\u00020c2\u0008\u0008\u0002\u0010d\u001a\u00020e2\u0008\u0008\u0002\u0010f\u001a\u00020\u000c2\u0008\u0008\u0002\u0010g\u001a\u00020\u000eH\u00c6\u0001\u00a2\u0006\u0003\u0010\u00a7\u0002J\n\u0010\u00a8\u0002\u001a\u00020\u000cH\u00d6\u0001J\u0016\u0010\u00a9\u0002\u001a\u00020\u000e2\n\u0010\u00aa\u0002\u001a\u0005\u0018\u00010\u00ab\u0002H\u00d6\u0003J\n\u0010\u00ac\u0002\u001a\u00020\u000cH\u00d6\u0001J\n\u0010\u00ad\u0002\u001a\u00020\u0007H\u00d6\u0001J\u001e\u0010\u00ae\u0002\u001a\u00030\u00af\u00022\u0008\u0010\u00b0\u0002\u001a\u00030\u00b1\u00022\u0007\u0010\u00b2\u0002\u001a\u00020\u000cH\u00d6\u0001R\u0016\u0010Q\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008i\u0010jR\u0016\u0010\u001e\u001a\u00020\u001f8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008k\u0010lR\u0016\u0010]\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008m\u0010nR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008o\u0010pR\u0016\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008q\u0010nR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008r\u0010sR\u0016\u0010\u0011\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008t\u0010jR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008u\u0010vR\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008w\u0010nR\u0016\u0010\u000b\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008x\u0010jR\u0016\u0010\u0010\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008y\u0010jR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008z\u0010pR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010}\u001a\u0004\u0008{\u0010|R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008~\u0010sR\u0016\u0010\\\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u007f\u0010nR\u0017\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0080\u0001\u0010pR\u0017\u0010I\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0081\u0001\u0010nR\u0017\u0010+\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0082\u0001\u0010nR\u0018\u0010d\u001a\u00020e8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u0017\u0010J\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0085\u0001\u0010nR\u0017\u0010?\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0086\u0001\u0010nR\u0017\u00103\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0087\u0001\u0010nR\u0017\u0010:\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0088\u0001\u0010nR\u0017\u0010;\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0089\u0001\u0010nR\u0017\u0010<\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u008a\u0001\u0010nR\u0017\u0010 \u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u008b\u0001\u0010nR\u0017\u00102\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u008c\u0001\u0010nR\u0017\u0010/\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u008d\u0001\u0010nR\u0017\u00100\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u008e\u0001\u0010nR\u0017\u00101\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u008f\u0001\u0010nR\u0017\u00107\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0090\u0001\u0010nR\u0017\u00108\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0091\u0001\u0010nR\u0017\u0010O\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0092\u0001\u0010nR\u0017\u0010N\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0093\u0001\u0010nR\u0017\u0010M\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0094\u0001\u0010nR\u0017\u0010!\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0095\u0001\u0010nR\u0017\u0010\"\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0096\u0001\u0010nR\u0017\u0010(\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0097\u0001\u0010nR\u0017\u0010#\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0098\u0001\u0010nR\u0017\u0010$\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0099\u0001\u0010nR\u0017\u0010A\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u009a\u0001\u0010nR\u0017\u00104\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u009b\u0001\u0010nR\u0017\u0010g\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u009c\u0001\u0010nR\u0017\u0010\u0018\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u009d\u0001\u0010nR\u0017\u0010G\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u009e\u0001\u0010nR\u0018\u0010b\u001a\u00020c8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u009f\u0001\u0010\u00a0\u0001R\u0017\u0010X\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a1\u0001\u0010nR\u0017\u0010>\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a2\u0001\u0010nR\u001d\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00148\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a3\u0001\u0010vR\u001a\u0010`\u001a\u0004\u0018\u00010a8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001R\u0017\u0010\u001c\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a6\u0001\u0010jR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a7\u0001\u0010pR\u0018\u0010Z\u001a\u00020[8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001R\u0017\u00105\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00aa\u0001\u0010jR\u0017\u0010L\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00ab\u0001\u0010jR\u0017\u0010K\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00ac\u0001\u0010jR\u0017\u0010\u0008\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00ad\u0001\u0010sR\u0017\u00106\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00ae\u0001\u0010jR\u0017\u0010f\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00af\u0001\u0010jR\u0017\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b0\u0001\u0010sR\u0017\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b1\u0001\u0010sR\u0017\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b2\u0001\u0010sR\u0017\u0010Y\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b3\u0001\u0010nR\u0019\u0010.\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b4\u0001\u0010pR\u0019\u0010-\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b5\u0001\u0010pR\u0017\u00109\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b6\u0001\u0010jR\u0017\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b7\u0001\u0010sR\u0017\u0010@\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b8\u0001\u0010nR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b9\u0001\u0010pR\u0018\u0010V\u001a\u00020W8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00ba\u0001\u0010\u00bb\u0001R\u0018\u0010^\u001a\u00020_8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00bc\u0001\u0010\u00bd\u0001R\u0017\u0010)\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00be\u0001\u0010jR\u0018\u0010\'\u001a\u00020&8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00bf\u0001\u0010\u00c0\u0001R\u0017\u0010*\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00c1\u0001\u0010jR\u0018\u0010%\u001a\u00020&8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00c2\u0001\u0010\u00c0\u0001R\u0019\u0010E\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00c3\u0001\u0010pR\u0017\u0010D\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00c4\u0001\u0010jR\u0017\u0010B\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00c5\u0001\u0010jR\u0017\u0010C\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00c6\u0001\u0010jR\u0017\u0010P\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00c7\u0001\u0010jR\u0017\u0010F\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00c8\u0001\u0010nR\u0017\u0010\u0019\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00c9\u0001\u0010nR\u0018\u0010T\u001a\u00020U8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00ca\u0001\u0010\u00cb\u0001R\u0019\u0010,\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00cc\u0001\u0010pR\u0017\u0010H\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00cd\u0001\u0010nR\u0018\u0010R\u001a\u00020S8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00ce\u0001\u0010\u00cf\u0001\u00a8\u0006\u00b3\u0002"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/RideConfig;",
        "Landroid/os/Parcelable;",
        "basePrice",
        "",
        "minutePrice",
        "parkingFinePrice",
        "currency",
        "",
        "maximumFreeRideAmount",
        "minimumUserBalance",
        "autoPayExpName",
        "autoPayRefillAmount",
        "",
        "autoPayUseFullscreenFlow",
        "",
        "autoPayPromptFirst",
        "autoPayStartAfterRideCount",
        "autoPayNagEveryRideCount",
        "autoPayMandatory",
        "autoPayPlans",
        "",
        "Lco/bird/android/model/wire/configs/AutoPayPlanConfig;",
        "autoPayMandatoryMinBalance",
        "autoPayTitleOverride",
        "enableSingleAuthForPositiveBalance",
        "showPriceChangeModalWithoutHistory",
        "priceChangeExpName",
        "minimumRidePrice",
        "includedMinutes",
        "localizedDynamicPriceString",
        "additionalFees",
        "Lco/bird/android/model/wire/configs/AdditionalFeesConfig;",
        "enableLocationOptOut",
        "enableRideWithoutLocationServices",
        "enableScanlessReservedRideStart",
        "enableScanlessRideStart",
        "enableScanlessRideStartScanner",
        "scanlessUpdateDistance",
        "",
        "scanlessRideBluetoothScanDuration",
        "enableScanlessRideBannerChirp",
        "scanlessRideBirdCacheExpirationTimeSeconds",
        "scanlessRideMaxApiScanLimit",
        "displayPartnerNameInRideReceipt",
        "supportContactNumber",
        "optionalLocalContactInfoTitle",
        "optionalLocalContactInfoNumber",
        "enableMultiModalMapPins",
        "enableMultiModalTutorialButton",
        "enableMultiModalTutorialSelection",
        "enableMapAreasByFleet",
        "enableDetailedVehicleInfo",
        "enableScannerCodeEntryV2",
        "maxBirdCodeLength",
        "minBirdCodeLength",
        "enableOutsideServiceAreaParkingTicket",
        "enableOutsideServiceAreaParkingTicketAcceptFine",
        "outsideServiceAreaParkingTicketAmount",
        "enableFreeUnlockAfterBadScan",
        "enableFreeUnlockAfterCancelledRide",
        "enableFreeUnlockAfterLowBatteryRide",
        "forceClientTracksByModel",
        "forceClientTracks",
        "enableChirpOnScanlessRideStart",
        "preferChirpAlarmOnScanlessRideStart",
        "enableScannerCodeEntryTooltip",
        "scannerCodeEntryTooltipMaxEntries",
        "scannerCodeEntryTooltipMaxViews",
        "scannerCodeEntryTooltipMaxDuration",
        "scannerCodeEntryTooltipLocalizedCopy",
        "showEndRideParkingRules",
        "enableVehicleTipUi",
        "useUpdatedSummaryFields",
        "disableEndRidePhotoMiddleIcon",
        "enableAndroidScanToRide",
        "maxRideDurationSecondsOutsideOperatingArea",
        "maxRideDurationSecondsNoRideZone",
        "enableRideStartOutsideOperatingArea",
        "enableRideStartNoRideZone",
        "enableRideAccelerationRecording",
        "sensorSamplingPeriodUs",
        "accelerationSampleChunkDuration",
        "warningConfig",
        "Lco/bird/android/model/wire/configs/RideWarningConfig;",
        "smartlockConfig",
        "Lco/bird/android/model/wire/configs/SmartlockRideConfig;",
        "rideLocationMode",
        "Lco/bird/android/model/wire/configs/RideLocationMode;",
        "filterNestsByBird",
        "mustParkInNest",
        "lockAckPollingIntervalSeconds",
        "",
        "bypassLockAckForBluetooth",
        "aggressiveEndRideLock",
        "safeRideStart",
        "Lco/bird/android/model/wire/configs/SafeStartConfig;",
        "helmetSelfie",
        "Lco/bird/android/model/wire/configs/HelmetSelfieConfig;",
        "endRide",
        "Lco/bird/android/model/wire/configs/EndRideConfig;",
        "dispute",
        "Lco/bird/android/model/wire/configs/DisputeConfig;",
        "minRiderAge",
        "enableShakeToReport",
        "(JJJLjava/lang/String;JJLjava/lang/String;ILjava/lang/Boolean;ZIIZLjava/util/List;JLjava/lang/String;ZZLjava/lang/String;JILjava/lang/String;Lco/bird/android/model/wire/configs/AdditionalFeesConfig;ZZZZZDDZIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIZZIZZZLjava/util/List;ZZZZIIILjava/lang/String;ZZZZZIIZZZIILco/bird/android/model/wire/configs/RideWarningConfig;Lco/bird/android/model/wire/configs/SmartlockRideConfig;Lco/bird/android/model/wire/configs/RideLocationMode;ZZFZZLco/bird/android/model/wire/configs/SafeStartConfig;Lco/bird/android/model/wire/configs/HelmetSelfieConfig;Lco/bird/android/model/wire/configs/EndRideConfig;Lco/bird/android/model/wire/configs/DisputeConfig;IZ)V",
        "getAccelerationSampleChunkDuration",
        "()I",
        "getAdditionalFees",
        "()Lco/bird/android/model/wire/configs/AdditionalFeesConfig;",
        "getAggressiveEndRideLock",
        "()Z",
        "getAutoPayExpName",
        "()Ljava/lang/String;",
        "getAutoPayMandatory",
        "getAutoPayMandatoryMinBalance",
        "()J",
        "getAutoPayNagEveryRideCount",
        "getAutoPayPlans",
        "()Ljava/util/List;",
        "getAutoPayPromptFirst",
        "getAutoPayRefillAmount",
        "getAutoPayStartAfterRideCount",
        "getAutoPayTitleOverride",
        "getAutoPayUseFullscreenFlow",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getBasePrice",
        "getBypassLockAckForBluetooth",
        "getCurrency",
        "getDisableEndRidePhotoMiddleIcon",
        "getDisplayPartnerNameInRideReceipt",
        "getDispute",
        "()Lco/bird/android/model/wire/configs/DisputeConfig;",
        "getEnableAndroidScanToRide",
        "getEnableChirpOnScanlessRideStart",
        "getEnableDetailedVehicleInfo",
        "getEnableFreeUnlockAfterBadScan",
        "getEnableFreeUnlockAfterCancelledRide",
        "getEnableFreeUnlockAfterLowBatteryRide",
        "getEnableLocationOptOut",
        "getEnableMapAreasByFleet",
        "getEnableMultiModalMapPins",
        "getEnableMultiModalTutorialButton",
        "getEnableMultiModalTutorialSelection",
        "getEnableOutsideServiceAreaParkingTicket",
        "getEnableOutsideServiceAreaParkingTicketAcceptFine",
        "getEnableRideAccelerationRecording",
        "getEnableRideStartNoRideZone",
        "getEnableRideStartOutsideOperatingArea",
        "getEnableRideWithoutLocationServices",
        "getEnableScanlessReservedRideStart",
        "getEnableScanlessRideBannerChirp",
        "getEnableScanlessRideStart",
        "getEnableScanlessRideStartScanner",
        "getEnableScannerCodeEntryTooltip",
        "getEnableScannerCodeEntryV2",
        "getEnableShakeToReport",
        "getEnableSingleAuthForPositiveBalance",
        "getEnableVehicleTipUi",
        "getEndRide",
        "()Lco/bird/android/model/wire/configs/EndRideConfig;",
        "getFilterNestsByBird",
        "getForceClientTracks",
        "getForceClientTracksByModel",
        "getHelmetSelfie",
        "()Lco/bird/android/model/wire/configs/HelmetSelfieConfig;",
        "getIncludedMinutes",
        "getLocalizedDynamicPriceString",
        "getLockAckPollingIntervalSeconds",
        "()F",
        "getMaxBirdCodeLength",
        "getMaxRideDurationSecondsNoRideZone",
        "getMaxRideDurationSecondsOutsideOperatingArea",
        "getMaximumFreeRideAmount",
        "getMinBirdCodeLength",
        "getMinRiderAge",
        "getMinimumRidePrice",
        "getMinimumUserBalance",
        "getMinutePrice",
        "getMustParkInNest",
        "getOptionalLocalContactInfoNumber",
        "getOptionalLocalContactInfoTitle",
        "getOutsideServiceAreaParkingTicketAmount",
        "getParkingFinePrice",
        "getPreferChirpAlarmOnScanlessRideStart",
        "getPriceChangeExpName",
        "getRideLocationMode",
        "()Lco/bird/android/model/wire/configs/RideLocationMode;",
        "getSafeRideStart",
        "()Lco/bird/android/model/wire/configs/SafeStartConfig;",
        "getScanlessRideBirdCacheExpirationTimeSeconds",
        "getScanlessRideBluetoothScanDuration",
        "()D",
        "getScanlessRideMaxApiScanLimit",
        "getScanlessUpdateDistance",
        "getScannerCodeEntryTooltipLocalizedCopy",
        "getScannerCodeEntryTooltipMaxDuration",
        "getScannerCodeEntryTooltipMaxEntries",
        "getScannerCodeEntryTooltipMaxViews",
        "getSensorSamplingPeriodUs",
        "getShowEndRideParkingRules",
        "getShowPriceChangeModalWithoutHistory",
        "getSmartlockConfig",
        "()Lco/bird/android/model/wire/configs/SmartlockRideConfig;",
        "getSupportContactNumber",
        "getUseUpdatedSummaryFields",
        "getWarningConfig",
        "()Lco/bird/android/model/wire/configs/RideWarningConfig;",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component2",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "component28",
        "component29",
        "component3",
        "component30",
        "component31",
        "component32",
        "component33",
        "component34",
        "component35",
        "component36",
        "component37",
        "component38",
        "component39",
        "component4",
        "component40",
        "component41",
        "component42",
        "component43",
        "component44",
        "component45",
        "component46",
        "component47",
        "component48",
        "component49",
        "component5",
        "component50",
        "component51",
        "component52",
        "component53",
        "component54",
        "component55",
        "component56",
        "component57",
        "component58",
        "component59",
        "component6",
        "component60",
        "component61",
        "component62",
        "component63",
        "component64",
        "component65",
        "component66",
        "component67",
        "component68",
        "component69",
        "component7",
        "component70",
        "component71",
        "component72",
        "component73",
        "component74",
        "component75",
        "component76",
        "component77",
        "component78",
        "component79",
        "component8",
        "component80",
        "component81",
        "component82",
        "component83",
        "component84",
        "component85",
        "component86",
        "component9",
        "copy",
        "(JJJLjava/lang/String;JJLjava/lang/String;ILjava/lang/Boolean;ZIIZLjava/util/List;JLjava/lang/String;ZZLjava/lang/String;JILjava/lang/String;Lco/bird/android/model/wire/configs/AdditionalFeesConfig;ZZZZZDDZIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIZZIZZZLjava/util/List;ZZZZIIILjava/lang/String;ZZZZZIIZZZIILco/bird/android/model/wire/configs/RideWarningConfig;Lco/bird/android/model/wire/configs/SmartlockRideConfig;Lco/bird/android/model/wire/configs/RideLocationMode;ZZFZZLco/bird/android/model/wire/configs/SafeStartConfig;Lco/bird/android/model/wire/configs/HelmetSelfieConfig;Lco/bird/android/model/wire/configs/EndRideConfig;Lco/bird/android/model/wire/configs/DisputeConfig;IZ)Lco/bird/android/model/wire/configs/RideConfig;",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "model-wire_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/wire/configs/RideConfig;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final accelerationSampleChunkDuration:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "acceleration_sample_chunk_duration"
    .end annotation

    .annotation runtime Lft5;
        value = "acceleration_sample_chunk_duration"
    .end annotation
.end field

.field private final additionalFees:Lco/bird/android/model/wire/configs/AdditionalFeesConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "additional_fees"
    .end annotation

    .annotation runtime Lft5;
        value = "additional_fees"
    .end annotation
.end field

.field private final aggressiveEndRideLock:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "aggressive_end_ride_lock"
    .end annotation

    .annotation runtime Lft5;
        value = "aggressive_end_ride_lock"
    .end annotation
.end field

.field private final autoPayExpName:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "auto_pay_exp_name"
    .end annotation

    .annotation runtime Lft5;
        value = "auto_pay_exp_name"
    .end annotation
.end field

.field private final autoPayMandatory:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "auto_pay_mandatory"
    .end annotation

    .annotation runtime Lft5;
        value = "auto_pay_mandatory"
    .end annotation
.end field

.field private final autoPayMandatoryMinBalance:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "auto_pay_mandatory_min_balance"
    .end annotation

    .annotation runtime Lft5;
        value = "auto_pay_mandatory_min_balance"
    .end annotation
.end field

.field private final autoPayNagEveryRideCount:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "auto_pay_nag_every_ride_count"
    .end annotation

    .annotation runtime Lft5;
        value = "auto_pay_nag_every_ride_count"
    .end annotation
.end field

.field private final autoPayPlans:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "auto_pay_plans"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/configs/AutoPayPlanConfig;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "auto_pay_plans"
    .end annotation
.end field

.field private final autoPayPromptFirst:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "auto_pay_prompt_first"
    .end annotation

    .annotation runtime Lft5;
        value = "auto_pay_prompt_first"
    .end annotation
.end field

.field private final autoPayRefillAmount:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "auto_pay_refill_amount"
    .end annotation

    .annotation runtime Lft5;
        value = "auto_pay_refill_amount"
    .end annotation
.end field

.field private final autoPayStartAfterRideCount:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "auto_pay_start_after_ride_count"
    .end annotation

    .annotation runtime Lft5;
        value = "auto_pay_start_after_ride_count"
    .end annotation
.end field

.field private final autoPayTitleOverride:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "auto_pay_title_override"
    .end annotation

    .annotation runtime Lft5;
        value = "auto_pay_title_override"
    .end annotation
.end field

.field private final autoPayUseFullscreenFlow:Ljava/lang/Boolean;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "auto_pay_use_fullscreen_flow"
    .end annotation

    .annotation runtime Lft5;
        value = "auto_pay_use_fullscreen_flow"
    .end annotation
.end field

.field private final basePrice:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "base_price"
    .end annotation

    .annotation runtime Lft5;
        value = "base_price"
    .end annotation
.end field

.field private final bypassLockAckForBluetooth:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bypass_lock_ack_bluetooth"
    .end annotation

    .annotation runtime Lft5;
        value = "bypass_lock_ack_bluetooth"
    .end annotation
.end field

.field private final currency:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "currency"
    .end annotation

    .annotation runtime Lft5;
        value = "currency"
    .end annotation
.end field

.field private final disableEndRidePhotoMiddleIcon:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "disable_end_ride_photo_middle_icon"
    .end annotation

    .annotation runtime Lft5;
        value = "disable_end_ride_photo_middle_icon"
    .end annotation
.end field

.field private final displayPartnerNameInRideReceipt:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "display_brand_name_in_ride_receipt"
    .end annotation

    .annotation runtime Lft5;
        value = "display_brand_name_in_ride_receipt"
    .end annotation
.end field

.field private final dispute:Lco/bird/android/model/wire/configs/DisputeConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "dispute"
    .end annotation

    .annotation runtime Lft5;
        value = "dispute"
    .end annotation
.end field

.field private final enableAndroidScanToRide:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_android_scan_to_ride"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_android_scan_to_ride"
    .end annotation
.end field

.field private final enableChirpOnScanlessRideStart:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_chirp_on_scanless_ride_start"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_chirp_on_scanless_ride_start"
    .end annotation
.end field

.field private final enableDetailedVehicleInfo:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_detailed_vehicle_info"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_detailed_vehicle_info"
    .end annotation
.end field

.field private final enableFreeUnlockAfterBadScan:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_free_unlock_after_bad_scan"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_free_unlock_after_bad_scan"
    .end annotation
.end field

.field private final enableFreeUnlockAfterCancelledRide:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_free_unlock_after_cancelled_ride"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_free_unlock_after_cancelled_ride"
    .end annotation
.end field

.field private final enableFreeUnlockAfterLowBatteryRide:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_free_unlock_after_low_battery_ride"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_free_unlock_after_low_battery_ride"
    .end annotation
.end field

.field private final enableLocationOptOut:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_location_opt_out"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_location_opt_out"
    .end annotation
.end field

.field private final enableMapAreasByFleet:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_map_areas_by_fleet"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_map_areas_by_fleet"
    .end annotation
.end field

.field private final enableMultiModalMapPins:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_multi_modal_map_pins"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_multi_modal_map_pins"
    .end annotation
.end field

.field private final enableMultiModalTutorialButton:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_multi_modal_tutorial_button"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_multi_modal_tutorial_button"
    .end annotation
.end field

.field private final enableMultiModalTutorialSelection:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_multi_modal_tutorial_selection"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_multi_modal_tutorial_selection"
    .end annotation
.end field

.field private final enableOutsideServiceAreaParkingTicket:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_outside_service_area_parking_ticket"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_outside_service_area_parking_ticket"
    .end annotation
.end field

.field private final enableOutsideServiceAreaParkingTicketAcceptFine:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_outside_service_area_parking_ticket_accept_fine"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_outside_service_area_parking_ticket_accept_fine"
    .end annotation
.end field

.field private final enableRideAccelerationRecording:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_ride_acceleration_recording"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_ride_acceleration_recording"
    .end annotation
.end field

.field private final enableRideStartNoRideZone:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_ride_start_no_ride_zone"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_ride_start_no_ride_zone"
    .end annotation
.end field

.field private final enableRideStartOutsideOperatingArea:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_ride_start_outside_operating_area"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_ride_start_outside_operating_area"
    .end annotation
.end field

.field private final enableRideWithoutLocationServices:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_ride_without_location_services"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_ride_without_location_services"
    .end annotation
.end field

.field private final enableScanlessReservedRideStart:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_scanless_reserved_ride_start"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_scanless_reserved_ride_start"
    .end annotation
.end field

.field private final enableScanlessRideBannerChirp:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_scanless_ride_banner_chirp"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_scanless_ride_banner_chirp"
    .end annotation
.end field

.field private final enableScanlessRideStart:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_scanless_ride_start"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_scanless_ride_start"
    .end annotation
.end field

.field private final enableScanlessRideStartScanner:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_scanless_ride_start_scanner"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_scanless_ride_start_scanner"
    .end annotation
.end field

.field private final enableScannerCodeEntryTooltip:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_scanner_code_entry_tooltip"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_scanner_code_entry_tooltip"
    .end annotation
.end field

.field private final enableScannerCodeEntryV2:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_scanner_code_entry_v2"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_scanner_code_entry_v2"
    .end annotation
.end field

.field private final enableShakeToReport:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_shake_to_report"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_shake_to_report"
    .end annotation
.end field

.field private final enableSingleAuthForPositiveBalance:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_single_auth_for_positive_balance"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_single_auth_for_positive_balance"
    .end annotation
.end field

.field private final enableVehicleTipUi:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_vehicle_tip_ui"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_vehicle_tip_ui"
    .end annotation
.end field

.field private final endRide:Lco/bird/android/model/wire/configs/EndRideConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "end_ride"
    .end annotation

    .annotation runtime Lft5;
        value = "end_ride"
    .end annotation
.end field

.field private final filterNestsByBird:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "filter_nests_by_bird"
    .end annotation

    .annotation runtime Lft5;
        value = "filter_nests_by_bird"
    .end annotation
.end field

.field private final forceClientTracks:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "force_client_tracks"
    .end annotation

    .annotation runtime Lft5;
        value = "force_client_tracks"
    .end annotation
.end field

.field private final forceClientTracksByModel:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "force_client_tracks_by_model"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "force_client_tracks_by_model"
    .end annotation
.end field

.field private final helmetSelfie:Lco/bird/android/model/wire/configs/HelmetSelfieConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "helmet_selfie"
    .end annotation

    .annotation runtime Lft5;
        value = "helmet_selfie"
    .end annotation
.end field

.field private final includedMinutes:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "included_minutes"
    .end annotation

    .annotation runtime Lft5;
        value = "included_minutes"
    .end annotation
.end field

.field private final localizedDynamicPriceString:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "localized_dynamic_price_string"
    .end annotation

    .annotation runtime Lft5;
        value = "localized_dynamic_price_string"
    .end annotation
.end field

.field private final lockAckPollingIntervalSeconds:F
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "lock_ack_polling_interval_seconds"
    .end annotation

    .annotation runtime Lft5;
        value = "lock_ack_polling_interval_seconds"
    .end annotation
.end field

.field private final maxBirdCodeLength:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "max_bird_code_length"
    .end annotation

    .annotation runtime Lft5;
        value = "max_bird_code_length"
    .end annotation
.end field

.field private final maxRideDurationSecondsNoRideZone:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "max_ride_duration_no_ride_zone"
    .end annotation

    .annotation runtime Lft5;
        value = "max_ride_duration_no_ride_zone"
    .end annotation
.end field

.field private final maxRideDurationSecondsOutsideOperatingArea:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "max_ride_duration_outside_operating_area"
    .end annotation

    .annotation runtime Lft5;
        value = "max_ride_duration_outside_operating_area"
    .end annotation
.end field

.field private final maximumFreeRideAmount:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "maximum_free_ride_amount"
    .end annotation

    .annotation runtime Lft5;
        value = "maximum_free_ride_amount"
    .end annotation
.end field

.field private final minBirdCodeLength:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "min_bird_code_length"
    .end annotation

    .annotation runtime Lft5;
        value = "min_bird_code_length"
    .end annotation
.end field

.field private final minRiderAge:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "min_rider_age"
    .end annotation

    .annotation runtime Lft5;
        value = "min_rider_age"
    .end annotation
.end field

.field private final minimumRidePrice:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "minimum_ride_price"
    .end annotation

    .annotation runtime Lft5;
        value = "minimum_ride_price"
    .end annotation
.end field

.field private final minimumUserBalance:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "minimum_user_balance"
    .end annotation

    .annotation runtime Lft5;
        value = "minimum_user_balance"
    .end annotation
.end field

.field private final minutePrice:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "minute_price"
    .end annotation

    .annotation runtime Lft5;
        value = "minute_price"
    .end annotation
.end field

.field private final mustParkInNest:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "must_park_in_nest"
    .end annotation

    .annotation runtime Lft5;
        value = "must_park_in_nest"
    .end annotation
.end field

.field private final optionalLocalContactInfoNumber:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "optional_local_contact_info_number"
    .end annotation

    .annotation runtime Lft5;
        value = "optional_local_contact_info_number"
    .end annotation
.end field

.field private final optionalLocalContactInfoTitle:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "optional_local_contact_info_title"
    .end annotation

    .annotation runtime Lft5;
        value = "optional_local_contact_info_title"
    .end annotation
.end field

.field private final outsideServiceAreaParkingTicketAmount:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "outside_service_area_parking_ticket_amount"
    .end annotation

    .annotation runtime Lft5;
        value = "outside_service_area_parking_ticket_amount"
    .end annotation
.end field

.field private final parkingFinePrice:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "parking_fine_price"
    .end annotation

    .annotation runtime Lft5;
        value = "parking_fine_price"
    .end annotation
.end field

.field private final preferChirpAlarmOnScanlessRideStart:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "prefer_chirp_alarm_on_scanless_ride_start"
    .end annotation

    .annotation runtime Lft5;
        value = "prefer_chirp_alarm_on_scanless_ride_start"
    .end annotation
.end field

.field private final priceChangeExpName:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "price_change_exp_name"
    .end annotation

    .annotation runtime Lft5;
        value = "price_change_exp_name"
    .end annotation
.end field

.field private final rideLocationMode:Lco/bird/android/model/wire/configs/RideLocationMode;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonAlias;
        value = {
            "ride_location_mode"
        }
    .end annotation

    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "client_location_heuristic"
    .end annotation

    .annotation runtime Lft5;
        alternate = {
            "ride_location_mode"
        }
        value = "client_location_heuristic"
    .end annotation
.end field

.field private final safeRideStart:Lco/bird/android/model/wire/configs/SafeStartConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "safe_ride_start"
    .end annotation

    .annotation runtime Lft5;
        value = "safe_ride_start"
    .end annotation
.end field

.field private final scanlessRideBirdCacheExpirationTimeSeconds:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "scanless_ride_bird_cache_expiration_time_seconds"
    .end annotation

    .annotation runtime Lft5;
        value = "scanless_ride_bird_cache_expiration_time_seconds"
    .end annotation
.end field

.field private final scanlessRideBluetoothScanDuration:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "scanless_ride_bluetooth_scan_duration"
    .end annotation

    .annotation runtime Lft5;
        value = "scanless_ride_bluetooth_scan_duration"
    .end annotation
.end field

.field private final scanlessRideMaxApiScanLimit:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "scanless_ride_max_api_scan_limit"
    .end annotation

    .annotation runtime Lft5;
        value = "scanless_ride_max_api_scan_limit"
    .end annotation
.end field

.field private final scanlessUpdateDistance:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "scanless_update_distance"
    .end annotation

    .annotation runtime Lft5;
        value = "scanless_update_distance"
    .end annotation
.end field

.field private final scannerCodeEntryTooltipLocalizedCopy:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "scanner_code_entry_tooltip_localized_copy"
    .end annotation

    .annotation runtime Lft5;
        value = "scanner_code_entry_tooltip_localized_copy"
    .end annotation
.end field

.field private final scannerCodeEntryTooltipMaxDuration:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "scanner_code_entry_tooltip_max_duration"
    .end annotation

    .annotation runtime Lft5;
        value = "scanner_code_entry_tooltip_max_duration"
    .end annotation
.end field

.field private final scannerCodeEntryTooltipMaxEntries:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "scanner_code_entry_tooltip_max_entries"
    .end annotation

    .annotation runtime Lft5;
        value = "scanner_code_entry_tooltip_max_entries"
    .end annotation
.end field

.field private final scannerCodeEntryTooltipMaxViews:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "scanner_code_entry_tooltip_max_views"
    .end annotation

    .annotation runtime Lft5;
        value = "scanner_code_entry_tooltip_max_views"
    .end annotation
.end field

.field private final sensorSamplingPeriodUs:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "sensor_sampling_period_us"
    .end annotation

    .annotation runtime Lft5;
        value = "sensor_sampling_period_us"
    .end annotation
.end field

.field private final showEndRideParkingRules:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "show_end_ride_parking_rules"
    .end annotation

    .annotation runtime Lft5;
        value = "show_end_ride_parking_rules"
    .end annotation
.end field

.field private final showPriceChangeModalWithoutHistory:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "price_change_exp_in_treatment_group"
    .end annotation

    .annotation runtime Lft5;
        value = "price_change_exp_in_treatment_group"
    .end annotation
.end field

.field private final smartlockConfig:Lco/bird/android/model/wire/configs/SmartlockRideConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "smartlock"
    .end annotation

    .annotation runtime Lft5;
        value = "smartlock"
    .end annotation
.end field

.field private final supportContactNumber:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "support_contact_number"
    .end annotation

    .annotation runtime Lft5;
        value = "support_contact_number"
    .end annotation
.end field

.field private final useUpdatedSummaryFields:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "use_updated_summary_fields"
    .end annotation

    .annotation runtime Lft5;
        value = "use_updated_summary_fields"
    .end annotation
.end field

.field private final warningConfig:Lco/bird/android/model/wire/configs/RideWarningConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "warning"
    .end annotation

    .annotation runtime Lft5;
        value = "warning"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/wire/configs/RideConfig$Creator;

    invoke-direct {v0}, Lco/bird/android/model/wire/configs/RideConfig$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/wire/configs/RideConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 100

    move-object/from16 v0, p0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x0

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, -0x1

    const/16 v97, -0x1

    const v98, 0x3fffff

    const/16 v99, 0x0

    invoke-direct/range {v0 .. v99}, Lco/bird/android/model/wire/configs/RideConfig;-><init>(JJJLjava/lang/String;JJLjava/lang/String;ILjava/lang/Boolean;ZIIZLjava/util/List;JLjava/lang/String;ZZLjava/lang/String;JILjava/lang/String;Lco/bird/android/model/wire/configs/AdditionalFeesConfig;ZZZZZDDZIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIZZIZZZLjava/util/List;ZZZZIIILjava/lang/String;ZZZZZIIZZZIILco/bird/android/model/wire/configs/RideWarningConfig;Lco/bird/android/model/wire/configs/SmartlockRideConfig;Lco/bird/android/model/wire/configs/RideLocationMode;ZZFZZLco/bird/android/model/wire/configs/SafeStartConfig;Lco/bird/android/model/wire/configs/HelmetSelfieConfig;Lco/bird/android/model/wire/configs/EndRideConfig;Lco/bird/android/model/wire/configs/DisputeConfig;IZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JJJLjava/lang/String;JJLjava/lang/String;ILjava/lang/Boolean;ZIIZLjava/util/List;JLjava/lang/String;ZZLjava/lang/String;JILjava/lang/String;Lco/bird/android/model/wire/configs/AdditionalFeesConfig;ZZZZZDDZIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIZZIZZZLjava/util/List;ZZZZIIILjava/lang/String;ZZZZZIIZZZIILco/bird/android/model/wire/configs/RideWarningConfig;Lco/bird/android/model/wire/configs/SmartlockRideConfig;Lco/bird/android/model/wire/configs/RideLocationMode;ZZFZZLco/bird/android/model/wire/configs/SafeStartConfig;Lco/bird/android/model/wire/configs/HelmetSelfieConfig;Lco/bird/android/model/wire/configs/EndRideConfig;Lco/bird/android/model/wire/configs/DisputeConfig;IZ)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ",
            "Ljava/lang/String;",
            "JJ",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Boolean;",
            "ZIIZ",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/configs/AutoPayPlanConfig;",
            ">;J",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/lang/String;",
            "JI",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/configs/AdditionalFeesConfig;",
            "ZZZZZDDZIIZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZZZZIIZZIZZZ",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZZZIII",
            "Ljava/lang/String;",
            "ZZZZZIIZZZII",
            "Lco/bird/android/model/wire/configs/RideWarningConfig;",
            "Lco/bird/android/model/wire/configs/SmartlockRideConfig;",
            "Lco/bird/android/model/wire/configs/RideLocationMode;",
            "ZZFZZ",
            "Lco/bird/android/model/wire/configs/SafeStartConfig;",
            "Lco/bird/android/model/wire/configs/HelmetSelfieConfig;",
            "Lco/bird/android/model/wire/configs/EndRideConfig;",
            "Lco/bird/android/model/wire/configs/DisputeConfig;",
            "IZ)V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p7

    move-object/from16 v2, p30

    move-object/from16 v3, p61

    move-object/from16 v4, p82

    move-object/from16 v5, p83

    move-object/from16 v6, p84

    move-object/from16 v7, p90

    move-object/from16 v8, p92

    move-object/from16 v9, p93

    const-string v10, "currency"

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "additionalFees"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "forceClientTracksByModel"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "warningConfig"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "smartlockConfig"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "rideLocationMode"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "safeRideStart"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "endRide"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "dispute"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v10, p1

    iput-wide v10, v0, Lco/bird/android/model/wire/configs/RideConfig;->basePrice:J

    move-wide v10, p3

    iput-wide v10, v0, Lco/bird/android/model/wire/configs/RideConfig;->minutePrice:J

    move-wide/from16 v10, p5

    iput-wide v10, v0, Lco/bird/android/model/wire/configs/RideConfig;->parkingFinePrice:J

    iput-object v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->currency:Ljava/lang/String;

    move-wide/from16 v10, p8

    iput-wide v10, v0, Lco/bird/android/model/wire/configs/RideConfig;->maximumFreeRideAmount:J

    move-wide/from16 v10, p10

    iput-wide v10, v0, Lco/bird/android/model/wire/configs/RideConfig;->minimumUserBalance:J

    move-object/from16 v1, p12

    iput-object v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayExpName:Ljava/lang/String;

    move/from16 v1, p13

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayRefillAmount:I

    move-object/from16 v1, p14

    iput-object v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayUseFullscreenFlow:Ljava/lang/Boolean;

    move/from16 v1, p15

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPromptFirst:Z

    move/from16 v1, p16

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayStartAfterRideCount:I

    move/from16 v1, p17

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayNagEveryRideCount:I

    move/from16 v1, p18

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatory:Z

    move-object/from16 v1, p19

    iput-object v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPlans:Ljava/util/List;

    move-wide/from16 v10, p20

    iput-wide v10, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatoryMinBalance:J

    move-object/from16 v1, p22

    iput-object v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayTitleOverride:Ljava/lang/String;

    move/from16 v1, p23

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableSingleAuthForPositiveBalance:Z

    move/from16 v1, p24

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->showPriceChangeModalWithoutHistory:Z

    move-object/from16 v1, p25

    iput-object v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->priceChangeExpName:Ljava/lang/String;

    move-wide/from16 v10, p26

    iput-wide v10, v0, Lco/bird/android/model/wire/configs/RideConfig;->minimumRidePrice:J

    move/from16 v1, p28

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->includedMinutes:I

    move-object/from16 v1, p29

    iput-object v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->localizedDynamicPriceString:Ljava/lang/String;

    iput-object v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->additionalFees:Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    move/from16 v1, p31

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableLocationOptOut:Z

    move/from16 v1, p32

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideWithoutLocationServices:Z

    move/from16 v1, p33

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessReservedRideStart:Z

    move/from16 v1, p34

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStart:Z

    move/from16 v1, p35

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStartScanner:Z

    move-wide/from16 v1, p36

    iput-wide v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessUpdateDistance:D

    move-wide/from16 v1, p38

    iput-wide v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBluetoothScanDuration:D

    move/from16 v1, p40

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideBannerChirp:Z

    move/from16 v1, p41

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBirdCacheExpirationTimeSeconds:I

    move/from16 v1, p42

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideMaxApiScanLimit:I

    move/from16 v1, p43

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->displayPartnerNameInRideReceipt:Z

    move-object/from16 v1, p44

    iput-object v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->supportContactNumber:Ljava/lang/String;

    move-object/from16 v1, p45

    iput-object v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoTitle:Ljava/lang/String;

    move-object/from16 v1, p46

    iput-object v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoNumber:Ljava/lang/String;

    move/from16 v1, p47

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalMapPins:Z

    move/from16 v1, p48

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialButton:Z

    move/from16 v1, p49

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialSelection:Z

    move/from16 v1, p50

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableMapAreasByFleet:Z

    move/from16 v1, p51

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableDetailedVehicleInfo:Z

    move/from16 v1, p52

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryV2:Z

    move/from16 v1, p53

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->maxBirdCodeLength:I

    move/from16 v1, p54

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->minBirdCodeLength:I

    move/from16 v1, p55

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicket:Z

    move/from16 v1, p56

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicketAcceptFine:Z

    move/from16 v1, p57

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->outsideServiceAreaParkingTicketAmount:I

    move/from16 v1, p58

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterBadScan:Z

    move/from16 v1, p59

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterCancelledRide:Z

    move/from16 v1, p60

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterLowBatteryRide:Z

    iput-object v3, v0, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracksByModel:Ljava/util/List;

    move/from16 v1, p62

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracks:Z

    move/from16 v1, p63

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableChirpOnScanlessRideStart:Z

    move/from16 v1, p64

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->preferChirpAlarmOnScanlessRideStart:Z

    move/from16 v1, p65

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryTooltip:Z

    move/from16 v1, p66

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxEntries:I

    move/from16 v1, p67

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxViews:I

    move/from16 v1, p68

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxDuration:I

    move-object/from16 v1, p69

    iput-object v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipLocalizedCopy:Ljava/lang/String;

    move/from16 v1, p70

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->showEndRideParkingRules:Z

    move/from16 v1, p71

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableVehicleTipUi:Z

    move/from16 v1, p72

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->useUpdatedSummaryFields:Z

    move/from16 v1, p73

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->disableEndRidePhotoMiddleIcon:Z

    move/from16 v1, p74

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableAndroidScanToRide:Z

    move/from16 v1, p75

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsOutsideOperatingArea:I

    move/from16 v1, p76

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsNoRideZone:I

    move/from16 v1, p77

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartOutsideOperatingArea:Z

    move/from16 v1, p78

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartNoRideZone:Z

    move/from16 v1, p79

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideAccelerationRecording:Z

    move/from16 v1, p80

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->sensorSamplingPeriodUs:I

    move/from16 v1, p81

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->accelerationSampleChunkDuration:I

    iput-object v4, v0, Lco/bird/android/model/wire/configs/RideConfig;->warningConfig:Lco/bird/android/model/wire/configs/RideWarningConfig;

    iput-object v5, v0, Lco/bird/android/model/wire/configs/RideConfig;->smartlockConfig:Lco/bird/android/model/wire/configs/SmartlockRideConfig;

    iput-object v6, v0, Lco/bird/android/model/wire/configs/RideConfig;->rideLocationMode:Lco/bird/android/model/wire/configs/RideLocationMode;

    move/from16 v1, p85

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->filterNestsByBird:Z

    move/from16 v1, p86

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->mustParkInNest:Z

    move/from16 v1, p87

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->lockAckPollingIntervalSeconds:F

    move/from16 v1, p88

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->bypassLockAckForBluetooth:Z

    move/from16 v1, p89

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->aggressiveEndRideLock:Z

    iput-object v7, v0, Lco/bird/android/model/wire/configs/RideConfig;->safeRideStart:Lco/bird/android/model/wire/configs/SafeStartConfig;

    move-object/from16 v1, p91

    iput-object v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->helmetSelfie:Lco/bird/android/model/wire/configs/HelmetSelfieConfig;

    iput-object v8, v0, Lco/bird/android/model/wire/configs/RideConfig;->endRide:Lco/bird/android/model/wire/configs/EndRideConfig;

    iput-object v9, v0, Lco/bird/android/model/wire/configs/RideConfig;->dispute:Lco/bird/android/model/wire/configs/DisputeConfig;

    move/from16 v1, p94

    iput v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->minRiderAge:I

    move/from16 v1, p95

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableShakeToReport:Z

    return-void
.end method

.method public synthetic constructor <init>(JJJLjava/lang/String;JJLjava/lang/String;ILjava/lang/Boolean;ZIIZLjava/util/List;JLjava/lang/String;ZZLjava/lang/String;JILjava/lang/String;Lco/bird/android/model/wire/configs/AdditionalFeesConfig;ZZZZZDDZIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIZZIZZZLjava/util/List;ZZZZIIILjava/lang/String;ZZZZZIIZZZIILco/bird/android/model/wire/configs/RideWarningConfig;Lco/bird/android/model/wire/configs/SmartlockRideConfig;Lco/bird/android/model/wire/configs/RideLocationMode;ZZFZZLco/bird/android/model/wire/configs/SafeStartConfig;Lco/bird/android/model/wire/configs/HelmetSelfieConfig;Lco/bird/android/model/wire/configs/EndRideConfig;Lco/bird/android/model/wire/configs/DisputeConfig;IZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 102

    move/from16 v0, p96

    move/from16 v1, p97

    move/from16 v2, p98

    and-int/lit8 v3, v0, 0x1

    if-eqz v3, :cond_0

    const-wide/16 v3, 0x64

    goto :goto_0

    :cond_0
    move-wide/from16 v3, p1

    :goto_0
    and-int/lit8 v5, v0, 0x2

    if-eqz v5, :cond_1

    const-wide/16 v5, 0xf

    goto :goto_1

    :cond_1
    move-wide/from16 v5, p3

    :goto_1
    and-int/lit8 v7, v0, 0x4

    if-eqz v7, :cond_2

    const-wide/16 v7, 0x3e8

    goto :goto_2

    :cond_2
    move-wide/from16 v7, p5

    :goto_2
    and-int/lit8 v9, v0, 0x8

    if-eqz v9, :cond_3

    const-string v9, "usd"

    goto :goto_3

    :cond_3
    move-object/from16 v9, p7

    :goto_3
    and-int/lit8 v10, v0, 0x10

    if-eqz v10, :cond_4

    const-wide/16 v10, 0x1f4

    goto :goto_4

    :cond_4
    move-wide/from16 v10, p8

    :goto_4
    and-int/lit8 v12, v0, 0x20

    if-eqz v12, :cond_5

    const-wide/16 v12, -0x64

    goto :goto_5

    :cond_5
    move-wide/from16 v12, p10

    :goto_5
    and-int/lit8 v14, v0, 0x40

    if-eqz v14, :cond_6

    const/4 v14, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v14, p12

    :goto_6
    and-int/lit16 v15, v0, 0x80

    move-object/from16 p99, v14

    if-eqz v15, :cond_7

    const/4 v15, 0x0

    goto :goto_7

    :cond_7
    move/from16 v15, p13

    :goto_7
    and-int/lit16 v14, v0, 0x100

    if-eqz v14, :cond_8

    const/4 v14, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v14, p14

    :goto_8
    move-object/from16 v16, v14

    and-int/lit16 v14, v0, 0x200

    if-eqz v14, :cond_9

    const/4 v14, 0x0

    goto :goto_9

    :cond_9
    move/from16 v14, p15

    :goto_9
    move/from16 v17, v14

    and-int/lit16 v14, v0, 0x400

    if-eqz v14, :cond_a

    const/4 v14, -0x1

    goto :goto_a

    :cond_a
    move/from16 v14, p16

    :goto_a
    move/from16 v18, v14

    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    const/4 v14, 0x0

    goto :goto_b

    :cond_b
    move/from16 v14, p17

    :goto_b
    move/from16 v19, v14

    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    const/4 v14, 0x0

    goto :goto_c

    :cond_c
    move/from16 v14, p18

    :goto_c
    move/from16 v20, v14

    and-int/lit16 v14, v0, 0x2000

    if-eqz v14, :cond_d

    const/4 v14, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v14, p19

    :goto_d
    move-object/from16 v21, v14

    and-int/lit16 v14, v0, 0x4000

    if-eqz v14, :cond_e

    const-wide/16 v22, 0x0

    goto :goto_e

    :cond_e
    move-wide/from16 v22, p20

    :goto_e
    const v14, 0x8000

    and-int v24, v0, v14

    if-eqz v24, :cond_f

    const/16 v24, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v24, p22

    :goto_f
    const/high16 v25, 0x10000

    and-int v26, v0, v25

    const/4 v14, 0x1

    if-eqz v26, :cond_10

    move/from16 v26, v14

    goto :goto_10

    :cond_10
    move/from16 v26, p23

    :goto_10
    const/high16 v27, 0x20000

    and-int v28, v0, v27

    if-eqz v28, :cond_11

    const/16 v28, 0x0

    goto :goto_11

    :cond_11
    move/from16 v28, p24

    :goto_11
    const/high16 v29, 0x40000

    and-int v30, v0, v29

    if-eqz v30, :cond_12

    const/16 v30, 0x0

    goto :goto_12

    :cond_12
    move-object/from16 v30, p25

    :goto_12
    const/high16 v31, 0x80000

    and-int v32, v0, v31

    if-eqz v32, :cond_13

    const-wide/16 v32, 0x0

    goto :goto_13

    :cond_13
    move-wide/from16 v32, p26

    :goto_13
    const/high16 v34, 0x100000

    and-int v34, v0, v34

    if-eqz v34, :cond_14

    const/16 v34, 0x0

    goto :goto_14

    :cond_14
    move/from16 v34, p28

    :goto_14
    const/high16 v35, 0x200000

    and-int v35, v0, v35

    if-eqz v35, :cond_15

    const/16 v35, 0x0

    goto :goto_15

    :cond_15
    move-object/from16 v35, p29

    :goto_15
    const/high16 v36, 0x400000

    and-int v36, v0, v36

    if-eqz v36, :cond_16

    move/from16 v36, v15

    new-instance v15, Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    move-wide/from16 v37, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct {v15, v13, v14, v12}, Lco/bird/android/model/wire/configs/AdditionalFeesConfig;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_16

    :cond_16
    move-wide/from16 v37, v12

    move/from16 v36, v15

    move-object/from16 v15, p30

    :goto_16
    const/high16 v12, 0x800000

    and-int/2addr v12, v0

    if-eqz v12, :cond_17

    const/4 v12, 0x0

    goto :goto_17

    :cond_17
    move/from16 v12, p31

    :goto_17
    const/high16 v13, 0x1000000

    and-int/2addr v13, v0

    if-eqz v13, :cond_18

    const/4 v13, 0x0

    goto :goto_18

    :cond_18
    move/from16 v13, p32

    :goto_18
    const/high16 v39, 0x2000000

    and-int v39, v0, v39

    if-eqz v39, :cond_19

    const/16 v39, 0x0

    goto :goto_19

    :cond_19
    move/from16 v39, p33

    :goto_19
    const/high16 v40, 0x4000000

    and-int v40, v0, v40

    if-eqz v40, :cond_1a

    const/16 v40, 0x0

    goto :goto_1a

    :cond_1a
    move/from16 v40, p34

    :goto_1a
    const/high16 v41, 0x8000000

    and-int v41, v0, v41

    if-eqz v41, :cond_1b

    const/16 v41, 0x0

    goto :goto_1b

    :cond_1b
    move/from16 v41, p35

    :goto_1b
    const/high16 v42, 0x10000000

    and-int v42, v0, v42

    if-eqz v42, :cond_1c

    const-wide/high16 v42, 0x4039000000000000L    # 25.0

    goto :goto_1c

    :cond_1c
    move-wide/from16 v42, p36

    :goto_1c
    const/high16 v44, 0x20000000

    and-int v44, v0, v44

    if-eqz v44, :cond_1d

    const-wide/high16 v44, 0x4000000000000000L    # 2.0

    goto :goto_1d

    :cond_1d
    move-wide/from16 v44, p38

    :goto_1d
    const/high16 v46, 0x40000000    # 2.0f

    and-int v46, v0, v46

    if-eqz v46, :cond_1e

    move/from16 v46, v14

    goto :goto_1e

    :cond_1e
    move/from16 v46, p40

    :goto_1e
    const/high16 v47, -0x80000000

    and-int v0, v0, v47

    if-eqz v0, :cond_1f

    const/16 v0, 0x12c

    goto :goto_1f

    :cond_1f
    move/from16 v0, p41

    :goto_1f
    and-int/lit8 v47, v1, 0x1

    if-eqz v47, :cond_20

    const/16 v47, 0x5

    goto :goto_20

    :cond_20
    move/from16 v47, p42

    :goto_20
    and-int/lit8 v48, v1, 0x2

    if-eqz v48, :cond_21

    const/16 v48, 0x0

    goto :goto_21

    :cond_21
    move/from16 v48, p43

    :goto_21
    and-int/lit8 v49, v1, 0x4

    if-eqz v49, :cond_22

    const/16 v49, 0x0

    goto :goto_22

    :cond_22
    move-object/from16 v49, p44

    :goto_22
    and-int/lit8 v50, v1, 0x8

    if-eqz v50, :cond_23

    const/16 v50, 0x0

    goto :goto_23

    :cond_23
    move-object/from16 v50, p45

    :goto_23
    and-int/lit8 v51, v1, 0x10

    if-eqz v51, :cond_24

    const/16 v51, 0x0

    goto :goto_24

    :cond_24
    move-object/from16 v51, p46

    :goto_24
    and-int/lit8 v52, v1, 0x20

    if-eqz v52, :cond_25

    const/16 v52, 0x0

    goto :goto_25

    :cond_25
    move/from16 v52, p47

    :goto_25
    and-int/lit8 v53, v1, 0x40

    if-eqz v53, :cond_26

    const/16 v53, 0x0

    goto :goto_26

    :cond_26
    move/from16 v53, p48

    :goto_26
    and-int/lit16 v14, v1, 0x80

    if-eqz v14, :cond_27

    const/4 v14, 0x0

    goto :goto_27

    :cond_27
    move/from16 v14, p49

    :goto_27
    move/from16 p96, v14

    and-int/lit16 v14, v1, 0x100

    if-eqz v14, :cond_28

    const/4 v14, 0x0

    goto :goto_28

    :cond_28
    move/from16 v14, p50

    :goto_28
    move/from16 v54, v14

    and-int/lit16 v14, v1, 0x200

    if-eqz v14, :cond_29

    const/4 v14, 0x0

    goto :goto_29

    :cond_29
    move/from16 v14, p51

    :goto_29
    move/from16 v55, v14

    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_2a

    const/4 v14, 0x0

    goto :goto_2a

    :cond_2a
    move/from16 v14, p52

    :goto_2a
    move/from16 v56, v14

    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_2b

    const/4 v14, 0x5

    goto :goto_2b

    :cond_2b
    move/from16 v14, p53

    :goto_2b
    move/from16 v57, v14

    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_2c

    const/4 v14, 0x4

    goto :goto_2c

    :cond_2c
    move/from16 v14, p54

    :goto_2c
    move/from16 v58, v14

    and-int/lit16 v14, v1, 0x2000

    if-eqz v14, :cond_2d

    const/4 v14, 0x0

    goto :goto_2d

    :cond_2d
    move/from16 v14, p55

    :goto_2d
    move/from16 v59, v14

    and-int/lit16 v14, v1, 0x4000

    if-eqz v14, :cond_2e

    const/4 v14, 0x0

    goto :goto_2e

    :cond_2e
    move/from16 v14, p56

    :goto_2e
    const v60, 0x8000

    and-int v61, v1, v60

    if-eqz v61, :cond_2f

    const/16 v60, 0x0

    goto :goto_2f

    :cond_2f
    move/from16 v60, p57

    :goto_2f
    and-int v61, v1, v25

    if-eqz v61, :cond_30

    const/16 v61, 0x0

    goto :goto_30

    :cond_30
    move/from16 v61, p58

    :goto_30
    and-int v62, v1, v27

    if-eqz v62, :cond_31

    const/16 v62, 0x0

    goto :goto_31

    :cond_31
    move/from16 v62, p59

    :goto_31
    and-int v63, v1, v29

    if-eqz v63, :cond_32

    const/16 v63, 0x0

    goto :goto_32

    :cond_32
    move/from16 v63, p60

    :goto_32
    and-int v64, v1, v31

    if-eqz v64, :cond_33

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v64

    goto :goto_33

    :cond_33
    move-object/from16 v64, p61

    :goto_33
    const/high16 v65, 0x100000

    and-int v65, v1, v65

    if-eqz v65, :cond_34

    const/16 v65, 0x0

    goto :goto_34

    :cond_34
    move/from16 v65, p62

    :goto_34
    const/high16 v66, 0x200000

    and-int v66, v1, v66

    if-eqz v66, :cond_35

    const/16 v66, 0x0

    goto :goto_35

    :cond_35
    move/from16 v66, p63

    :goto_35
    const/high16 v67, 0x400000

    and-int v67, v1, v67

    if-eqz v67, :cond_36

    const/16 v67, 0x0

    goto :goto_36

    :cond_36
    move/from16 v67, p64

    :goto_36
    const/high16 v68, 0x800000

    and-int v68, v1, v68

    if-eqz v68, :cond_37

    const/16 v68, 0x0

    goto :goto_37

    :cond_37
    move/from16 v68, p65

    :goto_37
    const/high16 v69, 0x1000000

    and-int v69, v1, v69

    if-eqz v69, :cond_38

    const/16 v69, 0x1

    goto :goto_38

    :cond_38
    move/from16 v69, p66

    :goto_38
    const/high16 v70, 0x2000000

    and-int v70, v1, v70

    if-eqz v70, :cond_39

    const/16 v70, 0x3

    goto :goto_39

    :cond_39
    move/from16 v70, p67

    :goto_39
    const/high16 v71, 0x4000000

    and-int v71, v1, v71

    if-eqz v71, :cond_3a

    const/16 v71, 0xa

    goto :goto_3a

    :cond_3a
    move/from16 v71, p68

    :goto_3a
    const/high16 v72, 0x8000000

    and-int v72, v1, v72

    if-eqz v72, :cond_3b

    const/16 v72, 0x0

    goto :goto_3b

    :cond_3b
    move-object/from16 v72, p69

    :goto_3b
    const/high16 v73, 0x10000000

    and-int v73, v1, v73

    if-eqz v73, :cond_3c

    const/16 v73, 0x0

    goto :goto_3c

    :cond_3c
    move/from16 v73, p70

    :goto_3c
    const/high16 v74, 0x20000000

    and-int v74, v1, v74

    if-eqz v74, :cond_3d

    const/16 v74, 0x0

    goto :goto_3d

    :cond_3d
    move/from16 v74, p71

    :goto_3d
    const/high16 v75, 0x40000000    # 2.0f

    and-int v75, v1, v75

    if-eqz v75, :cond_3e

    const/16 v75, 0x0

    goto :goto_3e

    :cond_3e
    move/from16 v75, p72

    :goto_3e
    const/high16 v76, -0x80000000

    and-int v1, v1, v76

    if-eqz v1, :cond_3f

    const/4 v1, 0x0

    goto :goto_3f

    :cond_3f
    move/from16 v1, p73

    :goto_3f
    and-int/lit8 v76, v2, 0x1

    if-eqz v76, :cond_40

    const/16 v76, 0x0

    goto :goto_40

    :cond_40
    move/from16 v76, p74

    :goto_40
    and-int/lit8 v77, v2, 0x2

    if-eqz v77, :cond_41

    const/16 v77, 0xb4

    goto :goto_41

    :cond_41
    move/from16 v77, p75

    :goto_41
    and-int/lit8 v78, v2, 0x4

    if-eqz v78, :cond_42

    const/16 v78, 0xb4

    goto :goto_42

    :cond_42
    move/from16 v78, p76

    :goto_42
    and-int/lit8 v79, v2, 0x8

    if-eqz v79, :cond_43

    const/16 v79, 0x0

    goto :goto_43

    :cond_43
    move/from16 v79, p77

    :goto_43
    and-int/lit8 v80, v2, 0x10

    if-eqz v80, :cond_44

    const/16 v80, 0x0

    goto :goto_44

    :cond_44
    move/from16 v80, p78

    :goto_44
    and-int/lit8 v81, v2, 0x20

    if-eqz v81, :cond_45

    const/16 v81, 0x0

    goto :goto_45

    :cond_45
    move/from16 v81, p79

    :goto_45
    and-int/lit8 v82, v2, 0x40

    if-eqz v82, :cond_46

    const/16 v82, 0x4e20

    goto :goto_46

    :cond_46
    move/from16 v82, p80

    :goto_46
    move/from16 p97, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_47

    const/16 v1, 0x28

    goto :goto_47

    :cond_47
    move/from16 v1, p81

    :goto_47
    move/from16 v83, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_48

    new-instance v1, Lco/bird/android/model/wire/configs/RideWarningConfig;

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x1f

    const/16 v90, 0x0

    move-object/from16 p5, v1

    move-object/from16 p6, v84

    move-object/from16 p7, v85

    move-object/from16 p8, v86

    move-object/from16 p9, v87

    move-object/from16 p10, v88

    move/from16 p11, v89

    move-object/from16 p12, v90

    invoke-direct/range {p5 .. p12}, Lco/bird/android/model/wire/configs/RideWarningConfig;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/wire/configs/WarningPresentationKind;Lco/bird/android/model/wire/configs/WarningPresentationKind;Lco/bird/android/model/wire/configs/WarningPresentationKind;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_48

    :cond_48
    move-object/from16 v1, p82

    :goto_48
    move-object/from16 v84, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_49

    new-instance v1, Lco/bird/android/model/wire/configs/SmartlockRideConfig;

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x3f

    const/16 v92, 0x0

    move-object/from16 p5, v1

    move-object/from16 p6, v85

    move-object/from16 p7, v86

    move-object/from16 p8, v87

    move-object/from16 p9, v88

    move-object/from16 p10, v89

    move-object/from16 p11, v90

    move/from16 p12, v91

    move-object/from16 p13, v92

    invoke-direct/range {p5 .. p13}, Lco/bird/android/model/wire/configs/SmartlockRideConfig;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_49

    :cond_49
    move-object/from16 v1, p83

    :goto_49
    move-object/from16 v85, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_4a

    sget-object v1, Lco/bird/android/model/wire/configs/RideLocationMode;->LEGACY:Lco/bird/android/model/wire/configs/RideLocationMode;

    goto :goto_4a

    :cond_4a
    move-object/from16 v1, p84

    :goto_4a
    move-object/from16 v86, v1

    and-int/lit16 v1, v2, 0x800

    if-eqz v1, :cond_4b

    const/4 v1, 0x0

    goto :goto_4b

    :cond_4b
    move/from16 v1, p85

    :goto_4b
    move/from16 v87, v1

    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_4c

    const/4 v1, 0x0

    goto :goto_4c

    :cond_4c
    move/from16 v1, p86

    :goto_4c
    move/from16 v88, v1

    and-int/lit16 v1, v2, 0x2000

    if-eqz v1, :cond_4d

    const/high16 v1, 0x40000000    # 2.0f

    goto :goto_4d

    :cond_4d
    move/from16 v1, p87

    :goto_4d
    move/from16 v89, v1

    and-int/lit16 v1, v2, 0x4000

    if-eqz v1, :cond_4e

    const/4 v1, 0x0

    goto :goto_4e

    :cond_4e
    move/from16 v1, p88

    :goto_4e
    const v90, 0x8000

    and-int v90, v2, v90

    if-eqz v90, :cond_4f

    const/16 v90, 0x0

    goto :goto_4f

    :cond_4f
    move/from16 v90, p89

    :goto_4f
    and-int v25, v2, v25

    if-eqz v25, :cond_50

    move/from16 v25, v1

    new-instance v1, Lco/bird/android/model/wire/configs/SafeStartConfig;

    move/from16 v92, v0

    move/from16 v93, v13

    move/from16 v91, v14

    const/4 v0, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-direct {v1, v0, v13, v14}, Lco/bird/android/model/wire/configs/SafeStartConfig;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_50

    :cond_50
    move/from16 v92, v0

    move/from16 v25, v1

    move/from16 v93, v13

    move/from16 v91, v14

    const/4 v13, 0x1

    move-object/from16 v1, p90

    :goto_50
    and-int v0, v2, v27

    if-eqz v0, :cond_51

    new-instance v0, Lco/bird/android/model/wire/configs/HelmetSelfieConfig;

    const/4 v14, 0x0

    const/16 v27, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const/16 v98, 0x0

    const/16 v99, 0x0

    const/16 v100, 0xff

    const/16 v101, 0x0

    move-object/from16 p2, v0

    move/from16 p3, v14

    move/from16 p4, v27

    move-object/from16 p5, v94

    move-object/from16 p6, v95

    move-object/from16 p7, v96

    move-object/from16 p8, v97

    move-object/from16 p9, v98

    move-object/from16 p10, v99

    move/from16 p11, v100

    move-object/from16 p12, v101

    invoke-direct/range {p2 .. p12}, Lco/bird/android/model/wire/configs/HelmetSelfieConfig;-><init>(ZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_51

    :cond_51
    move-object/from16 v0, p91

    :goto_51
    and-int v14, v2, v29

    if-eqz v14, :cond_52

    new-instance v14, Lco/bird/android/model/wire/configs/EndRideConfig;

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const/16 v98, 0x3f

    const/16 v99, 0x0

    move-object/from16 p2, v14

    move-object/from16 p3, v27

    move-object/from16 p4, v29

    move-object/from16 p5, v94

    move-object/from16 p6, v95

    move-object/from16 p7, v96

    move-object/from16 p8, v97

    move/from16 p9, v98

    move-object/from16 p10, v99

    invoke-direct/range {p2 .. p10}, Lco/bird/android/model/wire/configs/EndRideConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_52

    :cond_52
    move-object/from16 v14, p92

    :goto_52
    and-int v27, v2, v31

    if-eqz v27, :cond_53

    new-instance v13, Lco/bird/android/model/wire/configs/DisputeConfig;

    move-object/from16 v27, v14

    const/4 v14, 0x3

    move-object/from16 v29, v0

    const/4 v0, 0x0

    invoke-direct {v13, v0, v0, v14, v0}, Lco/bird/android/model/wire/configs/DisputeConfig;-><init>(Ljava/lang/Boolean;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_53

    :cond_53
    move-object/from16 v29, v0

    move-object/from16 v27, v14

    move-object/from16 v13, p93

    :goto_53
    const/high16 v0, 0x100000

    and-int/2addr v0, v2

    if-eqz v0, :cond_54

    const/16 v0, 0x12

    goto :goto_54

    :cond_54
    move/from16 v0, p94

    :goto_54
    const/high16 v14, 0x200000

    and-int/2addr v2, v14

    if-eqz v2, :cond_55

    const/4 v2, 0x1

    goto :goto_55

    :cond_55
    move/from16 v2, p95

    :goto_55
    move-object/from16 p1, p0

    move-wide/from16 p2, v3

    move-wide/from16 p4, v5

    move-wide/from16 p6, v7

    move-object/from16 p8, v9

    move-wide/from16 p9, v10

    move-wide/from16 p11, v37

    move-object/from16 p13, p99

    move/from16 p14, v36

    move-object/from16 p15, v16

    move/from16 p16, v17

    move/from16 p17, v18

    move/from16 p18, v19

    move/from16 p19, v20

    move-object/from16 p20, v21

    move-wide/from16 p21, v22

    move-object/from16 p23, v24

    move/from16 p24, v26

    move/from16 p25, v28

    move-object/from16 p26, v30

    move-wide/from16 p27, v32

    move/from16 p29, v34

    move-object/from16 p30, v35

    move-object/from16 p31, v15

    move/from16 p32, v12

    move/from16 p33, v93

    move/from16 p34, v39

    move/from16 p35, v40

    move/from16 p36, v41

    move-wide/from16 p37, v42

    move-wide/from16 p39, v44

    move/from16 p41, v46

    move/from16 p42, v92

    move/from16 p43, v47

    move/from16 p44, v48

    move-object/from16 p45, v49

    move-object/from16 p46, v50

    move-object/from16 p47, v51

    move/from16 p48, v52

    move/from16 p49, v53

    move/from16 p50, p96

    move/from16 p51, v54

    move/from16 p52, v55

    move/from16 p53, v56

    move/from16 p54, v57

    move/from16 p55, v58

    move/from16 p56, v59

    move/from16 p57, v91

    move/from16 p58, v60

    move/from16 p59, v61

    move/from16 p60, v62

    move/from16 p61, v63

    move-object/from16 p62, v64

    move/from16 p63, v65

    move/from16 p64, v66

    move/from16 p65, v67

    move/from16 p66, v68

    move/from16 p67, v69

    move/from16 p68, v70

    move/from16 p69, v71

    move-object/from16 p70, v72

    move/from16 p71, v73

    move/from16 p72, v74

    move/from16 p73, v75

    move/from16 p74, p97

    move/from16 p75, v76

    move/from16 p76, v77

    move/from16 p77, v78

    move/from16 p78, v79

    move/from16 p79, v80

    move/from16 p80, v81

    move/from16 p81, v82

    move/from16 p82, v83

    move-object/from16 p83, v84

    move-object/from16 p84, v85

    move-object/from16 p85, v86

    move/from16 p86, v87

    move/from16 p87, v88

    move/from16 p88, v89

    move/from16 p89, v25

    move/from16 p90, v90

    move-object/from16 p91, v1

    move-object/from16 p92, v29

    move-object/from16 p93, v27

    move-object/from16 p94, v13

    move/from16 p95, v0

    move/from16 p96, v2

    invoke-direct/range {p1 .. p96}, Lco/bird/android/model/wire/configs/RideConfig;-><init>(JJJLjava/lang/String;JJLjava/lang/String;ILjava/lang/Boolean;ZIIZLjava/util/List;JLjava/lang/String;ZZLjava/lang/String;JILjava/lang/String;Lco/bird/android/model/wire/configs/AdditionalFeesConfig;ZZZZZDDZIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIZZIZZZLjava/util/List;ZZZZIIILjava/lang/String;ZZZZZIIZZZIILco/bird/android/model/wire/configs/RideWarningConfig;Lco/bird/android/model/wire/configs/SmartlockRideConfig;Lco/bird/android/model/wire/configs/RideLocationMode;ZZFZZLco/bird/android/model/wire/configs/SafeStartConfig;Lco/bird/android/model/wire/configs/HelmetSelfieConfig;Lco/bird/android/model/wire/configs/EndRideConfig;Lco/bird/android/model/wire/configs/DisputeConfig;IZ)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/RideConfig;JJJLjava/lang/String;JJLjava/lang/String;ILjava/lang/Boolean;ZIIZLjava/util/List;JLjava/lang/String;ZZLjava/lang/String;JILjava/lang/String;Lco/bird/android/model/wire/configs/AdditionalFeesConfig;ZZZZZDDZIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIZZIZZZLjava/util/List;ZZZZIIILjava/lang/String;ZZZZZIIZZZIILco/bird/android/model/wire/configs/RideWarningConfig;Lco/bird/android/model/wire/configs/SmartlockRideConfig;Lco/bird/android/model/wire/configs/RideLocationMode;ZZFZZLco/bird/android/model/wire/configs/SafeStartConfig;Lco/bird/android/model/wire/configs/HelmetSelfieConfig;Lco/bird/android/model/wire/configs/EndRideConfig;Lco/bird/android/model/wire/configs/DisputeConfig;IZIIILjava/lang/Object;)Lco/bird/android/model/wire/configs/RideConfig;
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p96

    move/from16 v2, p97

    move/from16 v3, p98

    and-int/lit8 v4, v1, 0x1

    if-eqz v4, :cond_0

    iget-wide v4, v0, Lco/bird/android/model/wire/configs/RideConfig;->basePrice:J

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v6, v1, 0x2

    if-eqz v6, :cond_1

    iget-wide v6, v0, Lco/bird/android/model/wire/configs/RideConfig;->minutePrice:J

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p3

    :goto_1
    and-int/lit8 v8, v1, 0x4

    if-eqz v8, :cond_2

    iget-wide v8, v0, Lco/bird/android/model/wire/configs/RideConfig;->parkingFinePrice:J

    goto :goto_2

    :cond_2
    move-wide/from16 v8, p5

    :goto_2
    and-int/lit8 v10, v1, 0x8

    if-eqz v10, :cond_3

    iget-object v10, v0, Lco/bird/android/model/wire/configs/RideConfig;->currency:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit8 v11, v1, 0x10

    if-eqz v11, :cond_4

    iget-wide v11, v0, Lco/bird/android/model/wire/configs/RideConfig;->maximumFreeRideAmount:J

    goto :goto_4

    :cond_4
    move-wide/from16 v11, p8

    :goto_4
    and-int/lit8 v13, v1, 0x20

    if-eqz v13, :cond_5

    iget-wide v13, v0, Lco/bird/android/model/wire/configs/RideConfig;->minimumUserBalance:J

    goto :goto_5

    :cond_5
    move-wide/from16 v13, p10

    :goto_5
    and-int/lit8 v15, v1, 0x40

    if-eqz v15, :cond_6

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayExpName:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v15, p12

    :goto_6
    move-object/from16 p12, v15

    and-int/lit16 v15, v1, 0x80

    if-eqz v15, :cond_7

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayRefillAmount:I

    goto :goto_7

    :cond_7
    move/from16 v15, p13

    :goto_7
    move/from16 p13, v15

    and-int/lit16 v15, v1, 0x100

    if-eqz v15, :cond_8

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayUseFullscreenFlow:Ljava/lang/Boolean;

    goto :goto_8

    :cond_8
    move-object/from16 v15, p14

    :goto_8
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x200

    if-eqz v15, :cond_9

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPromptFirst:Z

    goto :goto_9

    :cond_9
    move/from16 v15, p15

    :goto_9
    move/from16 p15, v15

    and-int/lit16 v15, v1, 0x400

    if-eqz v15, :cond_a

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayStartAfterRideCount:I

    goto :goto_a

    :cond_a
    move/from16 v15, p16

    :goto_a
    move/from16 p16, v15

    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayNagEveryRideCount:I

    goto :goto_b

    :cond_b
    move/from16 v15, p17

    :goto_b
    move/from16 p17, v15

    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatory:Z

    goto :goto_c

    :cond_c
    move/from16 v15, p18

    :goto_c
    move/from16 p18, v15

    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPlans:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p19

    :goto_d
    move-object/from16 p19, v15

    and-int/lit16 v15, v1, 0x4000

    move-wide/from16 p10, v13

    if-eqz v15, :cond_e

    iget-wide v13, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatoryMinBalance:J

    goto :goto_e

    :cond_e
    move-wide/from16 v13, p20

    :goto_e
    const v15, 0x8000

    and-int v16, v1, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayTitleOverride:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p22

    :goto_f
    const/high16 v16, 0x10000

    and-int v17, v1, v16

    move-object/from16 p22, v15

    if-eqz v17, :cond_10

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableSingleAuthForPositiveBalance:Z

    goto :goto_10

    :cond_10
    move/from16 v15, p23

    :goto_10
    const/high16 v17, 0x20000

    and-int v18, v1, v17

    move/from16 p23, v15

    if-eqz v18, :cond_11

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->showPriceChangeModalWithoutHistory:Z

    goto :goto_11

    :cond_11
    move/from16 v15, p24

    :goto_11
    const/high16 v18, 0x40000

    and-int v19, v1, v18

    move/from16 p24, v15

    if-eqz v19, :cond_12

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->priceChangeExpName:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v15, p25

    :goto_12
    const/high16 v19, 0x80000

    and-int v20, v1, v19

    move-wide/from16 p20, v13

    if-eqz v20, :cond_13

    iget-wide v13, v0, Lco/bird/android/model/wire/configs/RideConfig;->minimumRidePrice:J

    goto :goto_13

    :cond_13
    move-wide/from16 v13, p26

    :goto_13
    const/high16 v20, 0x100000

    and-int v21, v1, v20

    move-wide/from16 p26, v13

    if-eqz v21, :cond_14

    iget v13, v0, Lco/bird/android/model/wire/configs/RideConfig;->includedMinutes:I

    goto :goto_14

    :cond_14
    move/from16 v13, p28

    :goto_14
    const/high16 v14, 0x200000

    and-int v21, v1, v14

    if-eqz v21, :cond_15

    iget-object v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->localizedDynamicPriceString:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v14, p29

    :goto_15
    const/high16 v21, 0x400000

    and-int v21, v1, v21

    move-object/from16 p29, v14

    if-eqz v21, :cond_16

    iget-object v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->additionalFees:Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    goto :goto_16

    :cond_16
    move-object/from16 v14, p30

    :goto_16
    const/high16 v21, 0x800000

    and-int v21, v1, v21

    move-object/from16 p30, v14

    if-eqz v21, :cond_17

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableLocationOptOut:Z

    goto :goto_17

    :cond_17
    move/from16 v14, p31

    :goto_17
    const/high16 v21, 0x1000000

    and-int v21, v1, v21

    move/from16 p31, v14

    if-eqz v21, :cond_18

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideWithoutLocationServices:Z

    goto :goto_18

    :cond_18
    move/from16 v14, p32

    :goto_18
    const/high16 v21, 0x2000000

    and-int v21, v1, v21

    move/from16 p32, v14

    if-eqz v21, :cond_19

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessReservedRideStart:Z

    goto :goto_19

    :cond_19
    move/from16 v14, p33

    :goto_19
    const/high16 v21, 0x4000000

    and-int v21, v1, v21

    move/from16 p33, v14

    if-eqz v21, :cond_1a

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStart:Z

    goto :goto_1a

    :cond_1a
    move/from16 v14, p34

    :goto_1a
    const/high16 v21, 0x8000000

    and-int v21, v1, v21

    move/from16 p34, v14

    if-eqz v21, :cond_1b

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStartScanner:Z

    goto :goto_1b

    :cond_1b
    move/from16 v14, p35

    :goto_1b
    const/high16 v21, 0x10000000

    and-int v21, v1, v21

    move/from16 p28, v13

    move/from16 p35, v14

    if-eqz v21, :cond_1c

    iget-wide v13, v0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessUpdateDistance:D

    goto :goto_1c

    :cond_1c
    move-wide/from16 v13, p36

    :goto_1c
    const/high16 v21, 0x20000000

    and-int v21, v1, v21

    move-wide/from16 p36, v13

    if-eqz v21, :cond_1d

    iget-wide v13, v0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBluetoothScanDuration:D

    goto :goto_1d

    :cond_1d
    move-wide/from16 v13, p38

    :goto_1d
    const/high16 v21, 0x40000000    # 2.0f

    and-int v21, v1, v21

    move-wide/from16 p38, v13

    if-eqz v21, :cond_1e

    iget-boolean v13, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideBannerChirp:Z

    goto :goto_1e

    :cond_1e
    move/from16 v13, p40

    :goto_1e
    const/high16 v14, -0x80000000

    and-int/2addr v1, v14

    if-eqz v1, :cond_1f

    iget v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBirdCacheExpirationTimeSeconds:I

    goto :goto_1f

    :cond_1f
    move/from16 v1, p41

    :goto_1f
    and-int/lit8 v14, v2, 0x1

    if-eqz v14, :cond_20

    iget v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideMaxApiScanLimit:I

    goto :goto_20

    :cond_20
    move/from16 v14, p42

    :goto_20
    and-int/lit8 v21, v2, 0x2

    move/from16 p42, v14

    if-eqz v21, :cond_21

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->displayPartnerNameInRideReceipt:Z

    goto :goto_21

    :cond_21
    move/from16 v14, p43

    :goto_21
    and-int/lit8 v21, v2, 0x4

    move/from16 p43, v14

    if-eqz v21, :cond_22

    iget-object v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->supportContactNumber:Ljava/lang/String;

    goto :goto_22

    :cond_22
    move-object/from16 v14, p44

    :goto_22
    and-int/lit8 v21, v2, 0x8

    move-object/from16 p44, v14

    if-eqz v21, :cond_23

    iget-object v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoTitle:Ljava/lang/String;

    goto :goto_23

    :cond_23
    move-object/from16 v14, p45

    :goto_23
    and-int/lit8 v21, v2, 0x10

    move-object/from16 p45, v14

    if-eqz v21, :cond_24

    iget-object v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoNumber:Ljava/lang/String;

    goto :goto_24

    :cond_24
    move-object/from16 v14, p46

    :goto_24
    and-int/lit8 v21, v2, 0x20

    move-object/from16 p46, v14

    if-eqz v21, :cond_25

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalMapPins:Z

    goto :goto_25

    :cond_25
    move/from16 v14, p47

    :goto_25
    and-int/lit8 v21, v2, 0x40

    move/from16 p47, v14

    if-eqz v21, :cond_26

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialButton:Z

    goto :goto_26

    :cond_26
    move/from16 v14, p48

    :goto_26
    move/from16 p48, v14

    and-int/lit16 v14, v2, 0x80

    if-eqz v14, :cond_27

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialSelection:Z

    goto :goto_27

    :cond_27
    move/from16 v14, p49

    :goto_27
    move/from16 p49, v14

    and-int/lit16 v14, v2, 0x100

    if-eqz v14, :cond_28

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableMapAreasByFleet:Z

    goto :goto_28

    :cond_28
    move/from16 v14, p50

    :goto_28
    move/from16 p50, v14

    and-int/lit16 v14, v2, 0x200

    if-eqz v14, :cond_29

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableDetailedVehicleInfo:Z

    goto :goto_29

    :cond_29
    move/from16 v14, p51

    :goto_29
    move/from16 p51, v14

    and-int/lit16 v14, v2, 0x400

    if-eqz v14, :cond_2a

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryV2:Z

    goto :goto_2a

    :cond_2a
    move/from16 v14, p52

    :goto_2a
    move/from16 p52, v14

    and-int/lit16 v14, v2, 0x800

    if-eqz v14, :cond_2b

    iget v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->maxBirdCodeLength:I

    goto :goto_2b

    :cond_2b
    move/from16 v14, p53

    :goto_2b
    move/from16 p53, v14

    and-int/lit16 v14, v2, 0x1000

    if-eqz v14, :cond_2c

    iget v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->minBirdCodeLength:I

    goto :goto_2c

    :cond_2c
    move/from16 v14, p54

    :goto_2c
    move/from16 p54, v14

    and-int/lit16 v14, v2, 0x2000

    if-eqz v14, :cond_2d

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicket:Z

    goto :goto_2d

    :cond_2d
    move/from16 v14, p55

    :goto_2d
    move/from16 p55, v14

    and-int/lit16 v14, v2, 0x4000

    if-eqz v14, :cond_2e

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicketAcceptFine:Z

    goto :goto_2e

    :cond_2e
    move/from16 v14, p56

    :goto_2e
    const v21, 0x8000

    and-int v22, v2, v21

    move/from16 p56, v14

    if-eqz v22, :cond_2f

    iget v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->outsideServiceAreaParkingTicketAmount:I

    goto :goto_2f

    :cond_2f
    move/from16 v14, p57

    :goto_2f
    and-int v21, v2, v16

    move/from16 p57, v14

    if-eqz v21, :cond_30

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterBadScan:Z

    goto :goto_30

    :cond_30
    move/from16 v14, p58

    :goto_30
    and-int v21, v2, v17

    move/from16 p58, v14

    if-eqz v21, :cond_31

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterCancelledRide:Z

    goto :goto_31

    :cond_31
    move/from16 v14, p59

    :goto_31
    and-int v21, v2, v18

    move/from16 p59, v14

    if-eqz v21, :cond_32

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterLowBatteryRide:Z

    goto :goto_32

    :cond_32
    move/from16 v14, p60

    :goto_32
    and-int v21, v2, v19

    move/from16 p60, v14

    if-eqz v21, :cond_33

    iget-object v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracksByModel:Ljava/util/List;

    goto :goto_33

    :cond_33
    move-object/from16 v14, p61

    :goto_33
    and-int v21, v2, v20

    move-object/from16 p61, v14

    if-eqz v21, :cond_34

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracks:Z

    goto :goto_34

    :cond_34
    move/from16 v14, p62

    :goto_34
    const/high16 v21, 0x200000

    and-int v22, v2, v21

    move/from16 p62, v14

    if-eqz v22, :cond_35

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableChirpOnScanlessRideStart:Z

    goto :goto_35

    :cond_35
    move/from16 v14, p63

    :goto_35
    const/high16 v21, 0x400000

    and-int v21, v2, v21

    move/from16 p63, v14

    if-eqz v21, :cond_36

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->preferChirpAlarmOnScanlessRideStart:Z

    goto :goto_36

    :cond_36
    move/from16 v14, p64

    :goto_36
    const/high16 v21, 0x800000

    and-int v21, v2, v21

    move/from16 p64, v14

    if-eqz v21, :cond_37

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryTooltip:Z

    goto :goto_37

    :cond_37
    move/from16 v14, p65

    :goto_37
    const/high16 v21, 0x1000000

    and-int v21, v2, v21

    move/from16 p65, v14

    if-eqz v21, :cond_38

    iget v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxEntries:I

    goto :goto_38

    :cond_38
    move/from16 v14, p66

    :goto_38
    const/high16 v21, 0x2000000

    and-int v21, v2, v21

    move/from16 p66, v14

    if-eqz v21, :cond_39

    iget v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxViews:I

    goto :goto_39

    :cond_39
    move/from16 v14, p67

    :goto_39
    const/high16 v21, 0x4000000

    and-int v21, v2, v21

    move/from16 p67, v14

    if-eqz v21, :cond_3a

    iget v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxDuration:I

    goto :goto_3a

    :cond_3a
    move/from16 v14, p68

    :goto_3a
    const/high16 v21, 0x8000000

    and-int v21, v2, v21

    move/from16 p68, v14

    if-eqz v21, :cond_3b

    iget-object v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipLocalizedCopy:Ljava/lang/String;

    goto :goto_3b

    :cond_3b
    move-object/from16 v14, p69

    :goto_3b
    const/high16 v21, 0x10000000

    and-int v21, v2, v21

    move-object/from16 p69, v14

    if-eqz v21, :cond_3c

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->showEndRideParkingRules:Z

    goto :goto_3c

    :cond_3c
    move/from16 v14, p70

    :goto_3c
    const/high16 v21, 0x20000000

    and-int v21, v2, v21

    move/from16 p70, v14

    if-eqz v21, :cond_3d

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableVehicleTipUi:Z

    goto :goto_3d

    :cond_3d
    move/from16 v14, p71

    :goto_3d
    const/high16 v21, 0x40000000    # 2.0f

    and-int v21, v2, v21

    move/from16 p71, v14

    if-eqz v21, :cond_3e

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->useUpdatedSummaryFields:Z

    goto :goto_3e

    :cond_3e
    move/from16 v14, p72

    :goto_3e
    const/high16 v21, -0x80000000

    and-int v2, v2, v21

    if-eqz v2, :cond_3f

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->disableEndRidePhotoMiddleIcon:Z

    goto :goto_3f

    :cond_3f
    move/from16 v2, p73

    :goto_3f
    and-int/lit8 v21, v3, 0x1

    move/from16 p73, v2

    if-eqz v21, :cond_40

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableAndroidScanToRide:Z

    goto :goto_40

    :cond_40
    move/from16 v2, p74

    :goto_40
    and-int/lit8 v21, v3, 0x2

    move/from16 p74, v2

    if-eqz v21, :cond_41

    iget v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsOutsideOperatingArea:I

    goto :goto_41

    :cond_41
    move/from16 v2, p75

    :goto_41
    and-int/lit8 v21, v3, 0x4

    move/from16 p75, v2

    if-eqz v21, :cond_42

    iget v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsNoRideZone:I

    goto :goto_42

    :cond_42
    move/from16 v2, p76

    :goto_42
    and-int/lit8 v21, v3, 0x8

    move/from16 p76, v2

    if-eqz v21, :cond_43

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartOutsideOperatingArea:Z

    goto :goto_43

    :cond_43
    move/from16 v2, p77

    :goto_43
    and-int/lit8 v21, v3, 0x10

    move/from16 p77, v2

    if-eqz v21, :cond_44

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartNoRideZone:Z

    goto :goto_44

    :cond_44
    move/from16 v2, p78

    :goto_44
    and-int/lit8 v21, v3, 0x20

    move/from16 p78, v2

    if-eqz v21, :cond_45

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideAccelerationRecording:Z

    goto :goto_45

    :cond_45
    move/from16 v2, p79

    :goto_45
    and-int/lit8 v21, v3, 0x40

    move/from16 p79, v2

    if-eqz v21, :cond_46

    iget v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->sensorSamplingPeriodUs:I

    goto :goto_46

    :cond_46
    move/from16 v2, p80

    :goto_46
    move/from16 p80, v2

    and-int/lit16 v2, v3, 0x80

    if-eqz v2, :cond_47

    iget v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->accelerationSampleChunkDuration:I

    goto :goto_47

    :cond_47
    move/from16 v2, p81

    :goto_47
    move/from16 p81, v2

    and-int/lit16 v2, v3, 0x100

    if-eqz v2, :cond_48

    iget-object v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->warningConfig:Lco/bird/android/model/wire/configs/RideWarningConfig;

    goto :goto_48

    :cond_48
    move-object/from16 v2, p82

    :goto_48
    move-object/from16 p82, v2

    and-int/lit16 v2, v3, 0x200

    if-eqz v2, :cond_49

    iget-object v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->smartlockConfig:Lco/bird/android/model/wire/configs/SmartlockRideConfig;

    goto :goto_49

    :cond_49
    move-object/from16 v2, p83

    :goto_49
    move-object/from16 p83, v2

    and-int/lit16 v2, v3, 0x400

    if-eqz v2, :cond_4a

    iget-object v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->rideLocationMode:Lco/bird/android/model/wire/configs/RideLocationMode;

    goto :goto_4a

    :cond_4a
    move-object/from16 v2, p84

    :goto_4a
    move-object/from16 p84, v2

    and-int/lit16 v2, v3, 0x800

    if-eqz v2, :cond_4b

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->filterNestsByBird:Z

    goto :goto_4b

    :cond_4b
    move/from16 v2, p85

    :goto_4b
    move/from16 p85, v2

    and-int/lit16 v2, v3, 0x1000

    if-eqz v2, :cond_4c

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->mustParkInNest:Z

    goto :goto_4c

    :cond_4c
    move/from16 v2, p86

    :goto_4c
    move/from16 p86, v2

    and-int/lit16 v2, v3, 0x2000

    if-eqz v2, :cond_4d

    iget v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->lockAckPollingIntervalSeconds:F

    goto :goto_4d

    :cond_4d
    move/from16 v2, p87

    :goto_4d
    move/from16 p87, v2

    and-int/lit16 v2, v3, 0x4000

    if-eqz v2, :cond_4e

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->bypassLockAckForBluetooth:Z

    goto :goto_4e

    :cond_4e
    move/from16 v2, p88

    :goto_4e
    const v21, 0x8000

    and-int v21, v3, v21

    move/from16 p88, v2

    if-eqz v21, :cond_4f

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->aggressiveEndRideLock:Z

    goto :goto_4f

    :cond_4f
    move/from16 v2, p89

    :goto_4f
    and-int v16, v3, v16

    move/from16 p89, v2

    if-eqz v16, :cond_50

    iget-object v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->safeRideStart:Lco/bird/android/model/wire/configs/SafeStartConfig;

    goto :goto_50

    :cond_50
    move-object/from16 v2, p90

    :goto_50
    and-int v16, v3, v17

    move-object/from16 p90, v2

    if-eqz v16, :cond_51

    iget-object v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->helmetSelfie:Lco/bird/android/model/wire/configs/HelmetSelfieConfig;

    goto :goto_51

    :cond_51
    move-object/from16 v2, p91

    :goto_51
    and-int v16, v3, v18

    move-object/from16 p91, v2

    if-eqz v16, :cond_52

    iget-object v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->endRide:Lco/bird/android/model/wire/configs/EndRideConfig;

    goto :goto_52

    :cond_52
    move-object/from16 v2, p92

    :goto_52
    and-int v16, v3, v19

    move-object/from16 p92, v2

    if-eqz v16, :cond_53

    iget-object v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->dispute:Lco/bird/android/model/wire/configs/DisputeConfig;

    goto :goto_53

    :cond_53
    move-object/from16 v2, p93

    :goto_53
    and-int v16, v3, v20

    move-object/from16 p93, v2

    if-eqz v16, :cond_54

    iget v2, v0, Lco/bird/android/model/wire/configs/RideConfig;->minRiderAge:I

    goto :goto_54

    :cond_54
    move/from16 v2, p94

    :goto_54
    const/high16 v16, 0x200000

    and-int v3, v3, v16

    if-eqz v3, :cond_55

    iget-boolean v3, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableShakeToReport:Z

    goto :goto_55

    :cond_55
    move/from16 v3, p95

    :goto_55
    move-wide/from16 p1, v4

    move-wide/from16 p3, v6

    move-wide/from16 p5, v8

    move-object/from16 p7, v10

    move-wide/from16 p8, v11

    move-object/from16 p25, v15

    move/from16 p40, v13

    move/from16 p41, v1

    move/from16 p72, v14

    move/from16 p94, v2

    move/from16 p95, v3

    invoke-virtual/range {p0 .. p95}, Lco/bird/android/model/wire/configs/RideConfig;->copy(JJJLjava/lang/String;JJLjava/lang/String;ILjava/lang/Boolean;ZIIZLjava/util/List;JLjava/lang/String;ZZLjava/lang/String;JILjava/lang/String;Lco/bird/android/model/wire/configs/AdditionalFeesConfig;ZZZZZDDZIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIZZIZZZLjava/util/List;ZZZZIIILjava/lang/String;ZZZZZIIZZZIILco/bird/android/model/wire/configs/RideWarningConfig;Lco/bird/android/model/wire/configs/SmartlockRideConfig;Lco/bird/android/model/wire/configs/RideLocationMode;ZZFZZLco/bird/android/model/wire/configs/SafeStartConfig;Lco/bird/android/model/wire/configs/HelmetSelfieConfig;Lco/bird/android/model/wire/configs/EndRideConfig;Lco/bird/android/model/wire/configs/DisputeConfig;IZ)Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->basePrice:J

    return-wide v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPromptFirst:Z

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayStartAfterRideCount:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayNagEveryRideCount:I

    return v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatory:Z

    return v0
.end method

.method public final component14()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/configs/AutoPayPlanConfig;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPlans:Ljava/util/List;

    return-object v0
.end method

.method public final component15()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatoryMinBalance:J

    return-wide v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayTitleOverride:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableSingleAuthForPositiveBalance:Z

    return v0
.end method

.method public final component18()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->showPriceChangeModalWithoutHistory:Z

    return v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->priceChangeExpName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->minutePrice:J

    return-wide v0
.end method

.method public final component20()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->minimumRidePrice:J

    return-wide v0
.end method

.method public final component21()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->includedMinutes:I

    return v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->localizedDynamicPriceString:Ljava/lang/String;

    return-object v0
.end method

.method public final component23()Lco/bird/android/model/wire/configs/AdditionalFeesConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->additionalFees:Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    return-object v0
.end method

.method public final component24()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableLocationOptOut:Z

    return v0
.end method

.method public final component25()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideWithoutLocationServices:Z

    return v0
.end method

.method public final component26()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessReservedRideStart:Z

    return v0
.end method

.method public final component27()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStart:Z

    return v0
.end method

.method public final component28()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStartScanner:Z

    return v0
.end method

.method public final component29()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessUpdateDistance:D

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->parkingFinePrice:J

    return-wide v0
.end method

.method public final component30()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBluetoothScanDuration:D

    return-wide v0
.end method

.method public final component31()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideBannerChirp:Z

    return v0
.end method

.method public final component32()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBirdCacheExpirationTimeSeconds:I

    return v0
.end method

.method public final component33()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideMaxApiScanLimit:I

    return v0
.end method

.method public final component34()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->displayPartnerNameInRideReceipt:Z

    return v0
.end method

.method public final component35()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->supportContactNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component36()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component37()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component38()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalMapPins:Z

    return v0
.end method

.method public final component39()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialButton:Z

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component40()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialSelection:Z

    return v0
.end method

.method public final component41()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMapAreasByFleet:Z

    return v0
.end method

.method public final component42()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableDetailedVehicleInfo:Z

    return v0
.end method

.method public final component43()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryV2:Z

    return v0
.end method

.method public final component44()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->maxBirdCodeLength:I

    return v0
.end method

.method public final component45()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->minBirdCodeLength:I

    return v0
.end method

.method public final component46()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicket:Z

    return v0
.end method

.method public final component47()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicketAcceptFine:Z

    return v0
.end method

.method public final component48()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->outsideServiceAreaParkingTicketAmount:I

    return v0
.end method

.method public final component49()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterBadScan:Z

    return v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->maximumFreeRideAmount:J

    return-wide v0
.end method

.method public final component50()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterCancelledRide:Z

    return v0
.end method

.method public final component51()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterLowBatteryRide:Z

    return v0
.end method

.method public final component52()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracksByModel:Ljava/util/List;

    return-object v0
.end method

.method public final component53()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracks:Z

    return v0
.end method

.method public final component54()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableChirpOnScanlessRideStart:Z

    return v0
.end method

.method public final component55()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->preferChirpAlarmOnScanlessRideStart:Z

    return v0
.end method

.method public final component56()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryTooltip:Z

    return v0
.end method

.method public final component57()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxEntries:I

    return v0
.end method

.method public final component58()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxViews:I

    return v0
.end method

.method public final component59()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxDuration:I

    return v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->minimumUserBalance:J

    return-wide v0
.end method

.method public final component60()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipLocalizedCopy:Ljava/lang/String;

    return-object v0
.end method

.method public final component61()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->showEndRideParkingRules:Z

    return v0
.end method

.method public final component62()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableVehicleTipUi:Z

    return v0
.end method

.method public final component63()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->useUpdatedSummaryFields:Z

    return v0
.end method

.method public final component64()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->disableEndRidePhotoMiddleIcon:Z

    return v0
.end method

.method public final component65()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableAndroidScanToRide:Z

    return v0
.end method

.method public final component66()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsOutsideOperatingArea:I

    return v0
.end method

.method public final component67()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsNoRideZone:I

    return v0
.end method

.method public final component68()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartOutsideOperatingArea:Z

    return v0
.end method

.method public final component69()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartNoRideZone:Z

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayExpName:Ljava/lang/String;

    return-object v0
.end method

.method public final component70()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideAccelerationRecording:Z

    return v0
.end method

.method public final component71()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->sensorSamplingPeriodUs:I

    return v0
.end method

.method public final component72()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->accelerationSampleChunkDuration:I

    return v0
.end method

.method public final component73()Lco/bird/android/model/wire/configs/RideWarningConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->warningConfig:Lco/bird/android/model/wire/configs/RideWarningConfig;

    return-object v0
.end method

.method public final component74()Lco/bird/android/model/wire/configs/SmartlockRideConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->smartlockConfig:Lco/bird/android/model/wire/configs/SmartlockRideConfig;

    return-object v0
.end method

.method public final component75()Lco/bird/android/model/wire/configs/RideLocationMode;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->rideLocationMode:Lco/bird/android/model/wire/configs/RideLocationMode;

    return-object v0
.end method

.method public final component76()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->filterNestsByBird:Z

    return v0
.end method

.method public final component77()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->mustParkInNest:Z

    return v0
.end method

.method public final component78()F
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->lockAckPollingIntervalSeconds:F

    return v0
.end method

.method public final component79()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->bypassLockAckForBluetooth:Z

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayRefillAmount:I

    return v0
.end method

.method public final component80()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->aggressiveEndRideLock:Z

    return v0
.end method

.method public final component81()Lco/bird/android/model/wire/configs/SafeStartConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->safeRideStart:Lco/bird/android/model/wire/configs/SafeStartConfig;

    return-object v0
.end method

.method public final component82()Lco/bird/android/model/wire/configs/HelmetSelfieConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->helmetSelfie:Lco/bird/android/model/wire/configs/HelmetSelfieConfig;

    return-object v0
.end method

.method public final component83()Lco/bird/android/model/wire/configs/EndRideConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->endRide:Lco/bird/android/model/wire/configs/EndRideConfig;

    return-object v0
.end method

.method public final component84()Lco/bird/android/model/wire/configs/DisputeConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->dispute:Lco/bird/android/model/wire/configs/DisputeConfig;

    return-object v0
.end method

.method public final component85()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->minRiderAge:I

    return v0
.end method

.method public final component86()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableShakeToReport:Z

    return v0
.end method

.method public final component9()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayUseFullscreenFlow:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(JJJLjava/lang/String;JJLjava/lang/String;ILjava/lang/Boolean;ZIIZLjava/util/List;JLjava/lang/String;ZZLjava/lang/String;JILjava/lang/String;Lco/bird/android/model/wire/configs/AdditionalFeesConfig;ZZZZZDDZIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIZZIZZZLjava/util/List;ZZZZIIILjava/lang/String;ZZZZZIIZZZIILco/bird/android/model/wire/configs/RideWarningConfig;Lco/bird/android/model/wire/configs/SmartlockRideConfig;Lco/bird/android/model/wire/configs/RideLocationMode;ZZFZZLco/bird/android/model/wire/configs/SafeStartConfig;Lco/bird/android/model/wire/configs/HelmetSelfieConfig;Lco/bird/android/model/wire/configs/EndRideConfig;Lco/bird/android/model/wire/configs/DisputeConfig;IZ)Lco/bird/android/model/wire/configs/RideConfig;
    .locals 97
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ",
            "Ljava/lang/String;",
            "JJ",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Boolean;",
            "ZIIZ",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/configs/AutoPayPlanConfig;",
            ">;J",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/lang/String;",
            "JI",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/configs/AdditionalFeesConfig;",
            "ZZZZZDDZIIZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZZZZIIZZIZZZ",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZZZIII",
            "Ljava/lang/String;",
            "ZZZZZIIZZZII",
            "Lco/bird/android/model/wire/configs/RideWarningConfig;",
            "Lco/bird/android/model/wire/configs/SmartlockRideConfig;",
            "Lco/bird/android/model/wire/configs/RideLocationMode;",
            "ZZFZZ",
            "Lco/bird/android/model/wire/configs/SafeStartConfig;",
            "Lco/bird/android/model/wire/configs/HelmetSelfieConfig;",
            "Lco/bird/android/model/wire/configs/EndRideConfig;",
            "Lco/bird/android/model/wire/configs/DisputeConfig;",
            "IZ)",
            "Lco/bird/android/model/wire/configs/RideConfig;"
        }
    .end annotation

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-object/from16 v7, p7

    move-wide/from16 v8, p8

    move-wide/from16 v10, p10

    move-object/from16 v12, p12

    move/from16 v13, p13

    move-object/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v19, p19

    move-wide/from16 v20, p20

    move-object/from16 v22, p22

    move/from16 v23, p23

    move/from16 v24, p24

    move-object/from16 v25, p25

    move-wide/from16 v26, p26

    move/from16 v28, p28

    move-object/from16 v29, p29

    move-object/from16 v30, p30

    move/from16 v31, p31

    move/from16 v32, p32

    move/from16 v33, p33

    move/from16 v34, p34

    move/from16 v35, p35

    move-wide/from16 v36, p36

    move-wide/from16 v38, p38

    move/from16 v40, p40

    move/from16 v41, p41

    move/from16 v42, p42

    move/from16 v43, p43

    move-object/from16 v44, p44

    move-object/from16 v45, p45

    move-object/from16 v46, p46

    move/from16 v47, p47

    move/from16 v48, p48

    move/from16 v49, p49

    move/from16 v50, p50

    move/from16 v51, p51

    move/from16 v52, p52

    move/from16 v53, p53

    move/from16 v54, p54

    move/from16 v55, p55

    move/from16 v56, p56

    move/from16 v57, p57

    move/from16 v58, p58

    move/from16 v59, p59

    move/from16 v60, p60

    move-object/from16 v61, p61

    move/from16 v62, p62

    move/from16 v63, p63

    move/from16 v64, p64

    move/from16 v65, p65

    move/from16 v66, p66

    move/from16 v67, p67

    move/from16 v68, p68

    move-object/from16 v69, p69

    move/from16 v70, p70

    move/from16 v71, p71

    move/from16 v72, p72

    move/from16 v73, p73

    move/from16 v74, p74

    move/from16 v75, p75

    move/from16 v76, p76

    move/from16 v77, p77

    move/from16 v78, p78

    move/from16 v79, p79

    move/from16 v80, p80

    move/from16 v81, p81

    move-object/from16 v82, p82

    move-object/from16 v83, p83

    move-object/from16 v84, p84

    move/from16 v85, p85

    move/from16 v86, p86

    move/from16 v87, p87

    move/from16 v88, p88

    move/from16 v89, p89

    move-object/from16 v90, p90

    move-object/from16 v91, p91

    move-object/from16 v92, p92

    move-object/from16 v93, p93

    move/from16 v94, p94

    move/from16 v95, p95

    const-string v0, "currency"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalFees"

    move-object/from16 v1, p30

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "forceClientTracksByModel"

    move-object/from16 v1, p61

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "warningConfig"

    move-object/from16 v1, p82

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smartlockConfig"

    move-object/from16 v1, p83

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideLocationMode"

    move-object/from16 v1, p84

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "safeRideStart"

    move-object/from16 v1, p90

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endRide"

    move-object/from16 v1, p92

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispute"

    move-object/from16 v1, p93

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v96, Lco/bird/android/model/wire/configs/RideConfig;

    move-object/from16 v0, v96

    move-wide/from16 v1, p1

    invoke-direct/range {v0 .. v95}, Lco/bird/android/model/wire/configs/RideConfig;-><init>(JJJLjava/lang/String;JJLjava/lang/String;ILjava/lang/Boolean;ZIIZLjava/util/List;JLjava/lang/String;ZZLjava/lang/String;JILjava/lang/String;Lco/bird/android/model/wire/configs/AdditionalFeesConfig;ZZZZZDDZIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIZZIZZZLjava/util/List;ZZZZIIILjava/lang/String;ZZZZZIIZZZIILco/bird/android/model/wire/configs/RideWarningConfig;Lco/bird/android/model/wire/configs/SmartlockRideConfig;Lco/bird/android/model/wire/configs/RideLocationMode;ZZFZZLco/bird/android/model/wire/configs/SafeStartConfig;Lco/bird/android/model/wire/configs/HelmetSelfieConfig;Lco/bird/android/model/wire/configs/EndRideConfig;Lco/bird/android/model/wire/configs/DisputeConfig;IZ)V

    return-object v96
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/RideConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/RideConfig;

    iget-wide v3, p0, Lco/bird/android/model/wire/configs/RideConfig;->basePrice:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/RideConfig;->basePrice:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/RideConfig;->minutePrice:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/RideConfig;->minutePrice:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/RideConfig;->parkingFinePrice:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/RideConfig;->parkingFinePrice:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->currency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/RideConfig;->maximumFreeRideAmount:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/RideConfig;->maximumFreeRideAmount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/RideConfig;->minimumUserBalance:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/RideConfig;->minimumUserBalance:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayExpName:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->autoPayExpName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayRefillAmount:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->autoPayRefillAmount:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayUseFullscreenFlow:Ljava/lang/Boolean;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->autoPayUseFullscreenFlow:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPromptFirst:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPromptFirst:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayStartAfterRideCount:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->autoPayStartAfterRideCount:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayNagEveryRideCount:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->autoPayNagEveryRideCount:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatory:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatory:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPlans:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPlans:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatoryMinBalance:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatoryMinBalance:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayTitleOverride:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->autoPayTitleOverride:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableSingleAuthForPositiveBalance:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableSingleAuthForPositiveBalance:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->showPriceChangeModalWithoutHistory:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->showPriceChangeModalWithoutHistory:Z

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->priceChangeExpName:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->priceChangeExpName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/RideConfig;->minimumRidePrice:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/RideConfig;->minimumRidePrice:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_15

    return v2

    :cond_15
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->includedMinutes:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->includedMinutes:I

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->localizedDynamicPriceString:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->localizedDynamicPriceString:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->additionalFees:Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->additionalFees:Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableLocationOptOut:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableLocationOptOut:Z

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideWithoutLocationServices:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableRideWithoutLocationServices:Z

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessReservedRideStart:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessReservedRideStart:Z

    if-eq v1, v3, :cond_1b

    return v2

    :cond_1b
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStart:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStart:Z

    if-eq v1, v3, :cond_1c

    return v2

    :cond_1c
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStartScanner:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStartScanner:Z

    if-eq v1, v3, :cond_1d

    return v2

    :cond_1d
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessUpdateDistance:D

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/RideConfig;->scanlessUpdateDistance:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_1e

    return v2

    :cond_1e
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBluetoothScanDuration:D

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBluetoothScanDuration:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_1f

    return v2

    :cond_1f
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideBannerChirp:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideBannerChirp:Z

    if-eq v1, v3, :cond_20

    return v2

    :cond_20
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBirdCacheExpirationTimeSeconds:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBirdCacheExpirationTimeSeconds:I

    if-eq v1, v3, :cond_21

    return v2

    :cond_21
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideMaxApiScanLimit:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideMaxApiScanLimit:I

    if-eq v1, v3, :cond_22

    return v2

    :cond_22
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->displayPartnerNameInRideReceipt:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->displayPartnerNameInRideReceipt:Z

    if-eq v1, v3, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->supportContactNumber:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->supportContactNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoTitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoNumber:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    return v2

    :cond_26
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalMapPins:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalMapPins:Z

    if-eq v1, v3, :cond_27

    return v2

    :cond_27
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialButton:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialButton:Z

    if-eq v1, v3, :cond_28

    return v2

    :cond_28
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialSelection:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialSelection:Z

    if-eq v1, v3, :cond_29

    return v2

    :cond_29
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMapAreasByFleet:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableMapAreasByFleet:Z

    if-eq v1, v3, :cond_2a

    return v2

    :cond_2a
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableDetailedVehicleInfo:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableDetailedVehicleInfo:Z

    if-eq v1, v3, :cond_2b

    return v2

    :cond_2b
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryV2:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryV2:Z

    if-eq v1, v3, :cond_2c

    return v2

    :cond_2c
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->maxBirdCodeLength:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->maxBirdCodeLength:I

    if-eq v1, v3, :cond_2d

    return v2

    :cond_2d
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->minBirdCodeLength:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->minBirdCodeLength:I

    if-eq v1, v3, :cond_2e

    return v2

    :cond_2e
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicket:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicket:Z

    if-eq v1, v3, :cond_2f

    return v2

    :cond_2f
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicketAcceptFine:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicketAcceptFine:Z

    if-eq v1, v3, :cond_30

    return v2

    :cond_30
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->outsideServiceAreaParkingTicketAmount:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->outsideServiceAreaParkingTicketAmount:I

    if-eq v1, v3, :cond_31

    return v2

    :cond_31
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterBadScan:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterBadScan:Z

    if-eq v1, v3, :cond_32

    return v2

    :cond_32
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterCancelledRide:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterCancelledRide:Z

    if-eq v1, v3, :cond_33

    return v2

    :cond_33
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterLowBatteryRide:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterLowBatteryRide:Z

    if-eq v1, v3, :cond_34

    return v2

    :cond_34
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracksByModel:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracksByModel:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_35

    return v2

    :cond_35
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracks:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracks:Z

    if-eq v1, v3, :cond_36

    return v2

    :cond_36
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableChirpOnScanlessRideStart:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableChirpOnScanlessRideStart:Z

    if-eq v1, v3, :cond_37

    return v2

    :cond_37
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->preferChirpAlarmOnScanlessRideStart:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->preferChirpAlarmOnScanlessRideStart:Z

    if-eq v1, v3, :cond_38

    return v2

    :cond_38
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryTooltip:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryTooltip:Z

    if-eq v1, v3, :cond_39

    return v2

    :cond_39
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxEntries:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxEntries:I

    if-eq v1, v3, :cond_3a

    return v2

    :cond_3a
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxViews:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxViews:I

    if-eq v1, v3, :cond_3b

    return v2

    :cond_3b
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxDuration:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxDuration:I

    if-eq v1, v3, :cond_3c

    return v2

    :cond_3c
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipLocalizedCopy:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipLocalizedCopy:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3d

    return v2

    :cond_3d
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->showEndRideParkingRules:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->showEndRideParkingRules:Z

    if-eq v1, v3, :cond_3e

    return v2

    :cond_3e
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableVehicleTipUi:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableVehicleTipUi:Z

    if-eq v1, v3, :cond_3f

    return v2

    :cond_3f
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->useUpdatedSummaryFields:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->useUpdatedSummaryFields:Z

    if-eq v1, v3, :cond_40

    return v2

    :cond_40
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->disableEndRidePhotoMiddleIcon:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->disableEndRidePhotoMiddleIcon:Z

    if-eq v1, v3, :cond_41

    return v2

    :cond_41
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableAndroidScanToRide:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableAndroidScanToRide:Z

    if-eq v1, v3, :cond_42

    return v2

    :cond_42
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsOutsideOperatingArea:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsOutsideOperatingArea:I

    if-eq v1, v3, :cond_43

    return v2

    :cond_43
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsNoRideZone:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsNoRideZone:I

    if-eq v1, v3, :cond_44

    return v2

    :cond_44
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartOutsideOperatingArea:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartOutsideOperatingArea:Z

    if-eq v1, v3, :cond_45

    return v2

    :cond_45
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartNoRideZone:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartNoRideZone:Z

    if-eq v1, v3, :cond_46

    return v2

    :cond_46
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideAccelerationRecording:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableRideAccelerationRecording:Z

    if-eq v1, v3, :cond_47

    return v2

    :cond_47
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->sensorSamplingPeriodUs:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->sensorSamplingPeriodUs:I

    if-eq v1, v3, :cond_48

    return v2

    :cond_48
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->accelerationSampleChunkDuration:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->accelerationSampleChunkDuration:I

    if-eq v1, v3, :cond_49

    return v2

    :cond_49
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->warningConfig:Lco/bird/android/model/wire/configs/RideWarningConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->warningConfig:Lco/bird/android/model/wire/configs/RideWarningConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4a

    return v2

    :cond_4a
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->smartlockConfig:Lco/bird/android/model/wire/configs/SmartlockRideConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->smartlockConfig:Lco/bird/android/model/wire/configs/SmartlockRideConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4b

    return v2

    :cond_4b
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->rideLocationMode:Lco/bird/android/model/wire/configs/RideLocationMode;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->rideLocationMode:Lco/bird/android/model/wire/configs/RideLocationMode;

    if-eq v1, v3, :cond_4c

    return v2

    :cond_4c
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->filterNestsByBird:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->filterNestsByBird:Z

    if-eq v1, v3, :cond_4d

    return v2

    :cond_4d
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->mustParkInNest:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->mustParkInNest:Z

    if-eq v1, v3, :cond_4e

    return v2

    :cond_4e
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->lockAckPollingIntervalSeconds:F

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->lockAckPollingIntervalSeconds:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4f

    return v2

    :cond_4f
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->bypassLockAckForBluetooth:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->bypassLockAckForBluetooth:Z

    if-eq v1, v3, :cond_50

    return v2

    :cond_50
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->aggressiveEndRideLock:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->aggressiveEndRideLock:Z

    if-eq v1, v3, :cond_51

    return v2

    :cond_51
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->safeRideStart:Lco/bird/android/model/wire/configs/SafeStartConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->safeRideStart:Lco/bird/android/model/wire/configs/SafeStartConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_52

    return v2

    :cond_52
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->helmetSelfie:Lco/bird/android/model/wire/configs/HelmetSelfieConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->helmetSelfie:Lco/bird/android/model/wire/configs/HelmetSelfieConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_53

    return v2

    :cond_53
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->endRide:Lco/bird/android/model/wire/configs/EndRideConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->endRide:Lco/bird/android/model/wire/configs/EndRideConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_54

    return v2

    :cond_54
    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->dispute:Lco/bird/android/model/wire/configs/DisputeConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->dispute:Lco/bird/android/model/wire/configs/DisputeConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_55

    return v2

    :cond_55
    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->minRiderAge:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RideConfig;->minRiderAge:I

    if-eq v1, v3, :cond_56

    return v2

    :cond_56
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableShakeToReport:Z

    iget-boolean p1, p1, Lco/bird/android/model/wire/configs/RideConfig;->enableShakeToReport:Z

    if-eq v1, p1, :cond_57

    return v2

    :cond_57
    return v0
.end method

.method public final getAccelerationSampleChunkDuration()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->accelerationSampleChunkDuration:I

    return v0
.end method

.method public final getAdditionalFees()Lco/bird/android/model/wire/configs/AdditionalFeesConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->additionalFees:Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    return-object v0
.end method

.method public final getAggressiveEndRideLock()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->aggressiveEndRideLock:Z

    return v0
.end method

.method public final getAutoPayExpName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayExpName:Ljava/lang/String;

    return-object v0
.end method

.method public final getAutoPayMandatory()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatory:Z

    return v0
.end method

.method public final getAutoPayMandatoryMinBalance()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatoryMinBalance:J

    return-wide v0
.end method

.method public final getAutoPayNagEveryRideCount()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayNagEveryRideCount:I

    return v0
.end method

.method public final getAutoPayPlans()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/configs/AutoPayPlanConfig;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPlans:Ljava/util/List;

    return-object v0
.end method

.method public final getAutoPayPromptFirst()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPromptFirst:Z

    return v0
.end method

.method public final getAutoPayRefillAmount()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayRefillAmount:I

    return v0
.end method

.method public final getAutoPayStartAfterRideCount()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayStartAfterRideCount:I

    return v0
.end method

.method public final getAutoPayTitleOverride()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayTitleOverride:Ljava/lang/String;

    return-object v0
.end method

.method public final getAutoPayUseFullscreenFlow()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayUseFullscreenFlow:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getBasePrice()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->basePrice:J

    return-wide v0
.end method

.method public final getBypassLockAckForBluetooth()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->bypassLockAckForBluetooth:Z

    return v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisableEndRidePhotoMiddleIcon()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->disableEndRidePhotoMiddleIcon:Z

    return v0
.end method

.method public final getDisplayPartnerNameInRideReceipt()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->displayPartnerNameInRideReceipt:Z

    return v0
.end method

.method public final getDispute()Lco/bird/android/model/wire/configs/DisputeConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->dispute:Lco/bird/android/model/wire/configs/DisputeConfig;

    return-object v0
.end method

.method public final getEnableAndroidScanToRide()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableAndroidScanToRide:Z

    return v0
.end method

.method public final getEnableChirpOnScanlessRideStart()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableChirpOnScanlessRideStart:Z

    return v0
.end method

.method public final getEnableDetailedVehicleInfo()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableDetailedVehicleInfo:Z

    return v0
.end method

.method public final getEnableFreeUnlockAfterBadScan()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterBadScan:Z

    return v0
.end method

.method public final getEnableFreeUnlockAfterCancelledRide()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterCancelledRide:Z

    return v0
.end method

.method public final getEnableFreeUnlockAfterLowBatteryRide()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterLowBatteryRide:Z

    return v0
.end method

.method public final getEnableLocationOptOut()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableLocationOptOut:Z

    return v0
.end method

.method public final getEnableMapAreasByFleet()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMapAreasByFleet:Z

    return v0
.end method

.method public final getEnableMultiModalMapPins()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalMapPins:Z

    return v0
.end method

.method public final getEnableMultiModalTutorialButton()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialButton:Z

    return v0
.end method

.method public final getEnableMultiModalTutorialSelection()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialSelection:Z

    return v0
.end method

.method public final getEnableOutsideServiceAreaParkingTicket()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicket:Z

    return v0
.end method

.method public final getEnableOutsideServiceAreaParkingTicketAcceptFine()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicketAcceptFine:Z

    return v0
.end method

.method public final getEnableRideAccelerationRecording()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideAccelerationRecording:Z

    return v0
.end method

.method public final getEnableRideStartNoRideZone()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartNoRideZone:Z

    return v0
.end method

.method public final getEnableRideStartOutsideOperatingArea()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartOutsideOperatingArea:Z

    return v0
.end method

.method public final getEnableRideWithoutLocationServices()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideWithoutLocationServices:Z

    return v0
.end method

.method public final getEnableScanlessReservedRideStart()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessReservedRideStart:Z

    return v0
.end method

.method public final getEnableScanlessRideBannerChirp()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideBannerChirp:Z

    return v0
.end method

.method public final getEnableScanlessRideStart()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStart:Z

    return v0
.end method

.method public final getEnableScanlessRideStartScanner()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStartScanner:Z

    return v0
.end method

.method public final getEnableScannerCodeEntryTooltip()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryTooltip:Z

    return v0
.end method

.method public final getEnableScannerCodeEntryV2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryV2:Z

    return v0
.end method

.method public final getEnableShakeToReport()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableShakeToReport:Z

    return v0
.end method

.method public final getEnableSingleAuthForPositiveBalance()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableSingleAuthForPositiveBalance:Z

    return v0
.end method

.method public final getEnableVehicleTipUi()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableVehicleTipUi:Z

    return v0
.end method

.method public final getEndRide()Lco/bird/android/model/wire/configs/EndRideConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->endRide:Lco/bird/android/model/wire/configs/EndRideConfig;

    return-object v0
.end method

.method public final getFilterNestsByBird()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->filterNestsByBird:Z

    return v0
.end method

.method public final getForceClientTracks()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracks:Z

    return v0
.end method

.method public final getForceClientTracksByModel()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracksByModel:Ljava/util/List;

    return-object v0
.end method

.method public final getHelmetSelfie()Lco/bird/android/model/wire/configs/HelmetSelfieConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->helmetSelfie:Lco/bird/android/model/wire/configs/HelmetSelfieConfig;

    return-object v0
.end method

.method public final getIncludedMinutes()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->includedMinutes:I

    return v0
.end method

.method public final getLocalizedDynamicPriceString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->localizedDynamicPriceString:Ljava/lang/String;

    return-object v0
.end method

.method public final getLockAckPollingIntervalSeconds()F
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->lockAckPollingIntervalSeconds:F

    return v0
.end method

.method public final getMaxBirdCodeLength()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->maxBirdCodeLength:I

    return v0
.end method

.method public final getMaxRideDurationSecondsNoRideZone()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsNoRideZone:I

    return v0
.end method

.method public final getMaxRideDurationSecondsOutsideOperatingArea()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsOutsideOperatingArea:I

    return v0
.end method

.method public final getMaximumFreeRideAmount()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->maximumFreeRideAmount:J

    return-wide v0
.end method

.method public final getMinBirdCodeLength()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->minBirdCodeLength:I

    return v0
.end method

.method public final getMinRiderAge()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->minRiderAge:I

    return v0
.end method

.method public final getMinimumRidePrice()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->minimumRidePrice:J

    return-wide v0
.end method

.method public final getMinimumUserBalance()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->minimumUserBalance:J

    return-wide v0
.end method

.method public final getMinutePrice()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->minutePrice:J

    return-wide v0
.end method

.method public final getMustParkInNest()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->mustParkInNest:Z

    return v0
.end method

.method public final getOptionalLocalContactInfoNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getOptionalLocalContactInfoTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getOutsideServiceAreaParkingTicketAmount()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->outsideServiceAreaParkingTicketAmount:I

    return v0
.end method

.method public final getParkingFinePrice()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->parkingFinePrice:J

    return-wide v0
.end method

.method public final getPreferChirpAlarmOnScanlessRideStart()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->preferChirpAlarmOnScanlessRideStart:Z

    return v0
.end method

.method public final getPriceChangeExpName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->priceChangeExpName:Ljava/lang/String;

    return-object v0
.end method

.method public final getRideLocationMode()Lco/bird/android/model/wire/configs/RideLocationMode;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->rideLocationMode:Lco/bird/android/model/wire/configs/RideLocationMode;

    return-object v0
.end method

.method public final getSafeRideStart()Lco/bird/android/model/wire/configs/SafeStartConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->safeRideStart:Lco/bird/android/model/wire/configs/SafeStartConfig;

    return-object v0
.end method

.method public final getScanlessRideBirdCacheExpirationTimeSeconds()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBirdCacheExpirationTimeSeconds:I

    return v0
.end method

.method public final getScanlessRideBluetoothScanDuration()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBluetoothScanDuration:D

    return-wide v0
.end method

.method public final getScanlessRideMaxApiScanLimit()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideMaxApiScanLimit:I

    return v0
.end method

.method public final getScanlessUpdateDistance()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessUpdateDistance:D

    return-wide v0
.end method

.method public final getScannerCodeEntryTooltipLocalizedCopy()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipLocalizedCopy:Ljava/lang/String;

    return-object v0
.end method

.method public final getScannerCodeEntryTooltipMaxDuration()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxDuration:I

    return v0
.end method

.method public final getScannerCodeEntryTooltipMaxEntries()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxEntries:I

    return v0
.end method

.method public final getScannerCodeEntryTooltipMaxViews()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxViews:I

    return v0
.end method

.method public final getSensorSamplingPeriodUs()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->sensorSamplingPeriodUs:I

    return v0
.end method

.method public final getShowEndRideParkingRules()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->showEndRideParkingRules:Z

    return v0
.end method

.method public final getShowPriceChangeModalWithoutHistory()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->showPriceChangeModalWithoutHistory:Z

    return v0
.end method

.method public final getSmartlockConfig()Lco/bird/android/model/wire/configs/SmartlockRideConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->smartlockConfig:Lco/bird/android/model/wire/configs/SmartlockRideConfig;

    return-object v0
.end method

.method public final getSupportContactNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->supportContactNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getUseUpdatedSummaryFields()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->useUpdatedSummaryFields:Z

    return v0
.end method

.method public final getWarningConfig()Lco/bird/android/model/wire/configs/RideWarningConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->warningConfig:Lco/bird/android/model/wire/configs/RideWarningConfig;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->basePrice:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->minutePrice:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->parkingFinePrice:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->currency:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->maximumFreeRideAmount:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->minimumUserBalance:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayExpName:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayRefillAmount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayUseFullscreenFlow:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPromptFirst:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    move v1, v3

    :cond_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayStartAfterRideCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayNagEveryRideCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatory:Z

    if-eqz v1, :cond_3

    move v1, v3

    :cond_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPlans:Ljava/util/List;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v4, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatoryMinBalance:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayTitleOverride:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_3

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableSingleAuthForPositiveBalance:Z

    if-eqz v1, :cond_6

    move v1, v3

    :cond_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->showPriceChangeModalWithoutHistory:Z

    if-eqz v1, :cond_7

    move v1, v3

    :cond_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->priceChangeExpName:Ljava/lang/String;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_4

    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v4, p0, Lco/bird/android/model/wire/configs/RideConfig;->minimumRidePrice:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->includedMinutes:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->localizedDynamicPriceString:Ljava/lang/String;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_5

    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->additionalFees:Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/AdditionalFeesConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableLocationOptOut:Z

    if-eqz v1, :cond_a

    move v1, v3

    :cond_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideWithoutLocationServices:Z

    if-eqz v1, :cond_b

    move v1, v3

    :cond_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessReservedRideStart:Z

    if-eqz v1, :cond_c

    move v1, v3

    :cond_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStart:Z

    if-eqz v1, :cond_d

    move v1, v3

    :cond_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStartScanner:Z

    if-eqz v1, :cond_e

    move v1, v3

    :cond_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v4, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessUpdateDistance:D

    invoke-static {v4, v5}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v4, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBluetoothScanDuration:D

    invoke-static {v4, v5}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideBannerChirp:Z

    if-eqz v1, :cond_f

    move v1, v3

    :cond_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBirdCacheExpirationTimeSeconds:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideMaxApiScanLimit:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->displayPartnerNameInRideReceipt:Z

    if-eqz v1, :cond_10

    move v1, v3

    :cond_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->supportContactNumber:Ljava/lang/String;

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_6

    :cond_11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoTitle:Ljava/lang/String;

    if-nez v1, :cond_12

    move v1, v2

    goto :goto_7

    :cond_12
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoNumber:Ljava/lang/String;

    if-nez v1, :cond_13

    move v1, v2

    goto :goto_8

    :cond_13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalMapPins:Z

    if-eqz v1, :cond_14

    move v1, v3

    :cond_14
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialButton:Z

    if-eqz v1, :cond_15

    move v1, v3

    :cond_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialSelection:Z

    if-eqz v1, :cond_16

    move v1, v3

    :cond_16
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMapAreasByFleet:Z

    if-eqz v1, :cond_17

    move v1, v3

    :cond_17
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableDetailedVehicleInfo:Z

    if-eqz v1, :cond_18

    move v1, v3

    :cond_18
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryV2:Z

    if-eqz v1, :cond_19

    move v1, v3

    :cond_19
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->maxBirdCodeLength:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->minBirdCodeLength:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicket:Z

    if-eqz v1, :cond_1a

    move v1, v3

    :cond_1a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicketAcceptFine:Z

    if-eqz v1, :cond_1b

    move v1, v3

    :cond_1b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->outsideServiceAreaParkingTicketAmount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterBadScan:Z

    if-eqz v1, :cond_1c

    move v1, v3

    :cond_1c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterCancelledRide:Z

    if-eqz v1, :cond_1d

    move v1, v3

    :cond_1d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterLowBatteryRide:Z

    if-eqz v1, :cond_1e

    move v1, v3

    :cond_1e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracksByModel:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracks:Z

    if-eqz v1, :cond_1f

    move v1, v3

    :cond_1f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableChirpOnScanlessRideStart:Z

    if-eqz v1, :cond_20

    move v1, v3

    :cond_20
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->preferChirpAlarmOnScanlessRideStart:Z

    if-eqz v1, :cond_21

    move v1, v3

    :cond_21
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryTooltip:Z

    if-eqz v1, :cond_22

    move v1, v3

    :cond_22
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxEntries:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxViews:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipLocalizedCopy:Ljava/lang/String;

    if-nez v1, :cond_23

    move v1, v2

    goto :goto_9

    :cond_23
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->showEndRideParkingRules:Z

    if-eqz v1, :cond_24

    move v1, v3

    :cond_24
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableVehicleTipUi:Z

    if-eqz v1, :cond_25

    move v1, v3

    :cond_25
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->useUpdatedSummaryFields:Z

    if-eqz v1, :cond_26

    move v1, v3

    :cond_26
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->disableEndRidePhotoMiddleIcon:Z

    if-eqz v1, :cond_27

    move v1, v3

    :cond_27
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableAndroidScanToRide:Z

    if-eqz v1, :cond_28

    move v1, v3

    :cond_28
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsOutsideOperatingArea:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsNoRideZone:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartOutsideOperatingArea:Z

    if-eqz v1, :cond_29

    move v1, v3

    :cond_29
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartNoRideZone:Z

    if-eqz v1, :cond_2a

    move v1, v3

    :cond_2a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideAccelerationRecording:Z

    if-eqz v1, :cond_2b

    move v1, v3

    :cond_2b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->sensorSamplingPeriodUs:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->accelerationSampleChunkDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->warningConfig:Lco/bird/android/model/wire/configs/RideWarningConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/RideWarningConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->smartlockConfig:Lco/bird/android/model/wire/configs/SmartlockRideConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/SmartlockRideConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->rideLocationMode:Lco/bird/android/model/wire/configs/RideLocationMode;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->filterNestsByBird:Z

    if-eqz v1, :cond_2c

    move v1, v3

    :cond_2c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->mustParkInNest:Z

    if-eqz v1, :cond_2d

    move v1, v3

    :cond_2d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->lockAckPollingIntervalSeconds:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->bypassLockAckForBluetooth:Z

    if-eqz v1, :cond_2e

    move v1, v3

    :cond_2e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->aggressiveEndRideLock:Z

    if-eqz v1, :cond_2f

    move v1, v3

    :cond_2f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->safeRideStart:Lco/bird/android/model/wire/configs/SafeStartConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/SafeStartConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->helmetSelfie:Lco/bird/android/model/wire/configs/HelmetSelfieConfig;

    if-nez v1, :cond_30

    goto :goto_a

    :cond_30
    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/HelmetSelfieConfig;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->endRide:Lco/bird/android/model/wire/configs/EndRideConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/EndRideConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->dispute:Lco/bird/android/model/wire/configs/DisputeConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/DisputeConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->minRiderAge:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableShakeToReport:Z

    if-eqz v1, :cond_31

    goto :goto_b

    :cond_31
    move v3, v1

    :goto_b
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 97

    move-object/from16 v0, p0

    iget-wide v1, v0, Lco/bird/android/model/wire/configs/RideConfig;->basePrice:J

    iget-wide v3, v0, Lco/bird/android/model/wire/configs/RideConfig;->minutePrice:J

    iget-wide v5, v0, Lco/bird/android/model/wire/configs/RideConfig;->parkingFinePrice:J

    iget-object v7, v0, Lco/bird/android/model/wire/configs/RideConfig;->currency:Ljava/lang/String;

    iget-wide v8, v0, Lco/bird/android/model/wire/configs/RideConfig;->maximumFreeRideAmount:J

    iget-wide v10, v0, Lco/bird/android/model/wire/configs/RideConfig;->minimumUserBalance:J

    iget-object v12, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayExpName:Ljava/lang/String;

    iget v13, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayRefillAmount:I

    iget-object v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayUseFullscreenFlow:Ljava/lang/Boolean;

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPromptFirst:Z

    move/from16 v16, v15

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayStartAfterRideCount:I

    move/from16 v17, v15

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayNagEveryRideCount:I

    move/from16 v18, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatory:Z

    move/from16 v19, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPlans:Ljava/util/List;

    move-object/from16 v20, v14

    move-object/from16 v21, v15

    iget-wide v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatoryMinBalance:J

    move-wide/from16 v22, v14

    iget-object v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayTitleOverride:Ljava/lang/String;

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableSingleAuthForPositiveBalance:Z

    move/from16 v24, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->showPriceChangeModalWithoutHistory:Z

    move/from16 v25, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->priceChangeExpName:Ljava/lang/String;

    move-object/from16 v26, v14

    move-object/from16 v27, v15

    iget-wide v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->minimumRidePrice:J

    move-wide/from16 v28, v14

    iget v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->includedMinutes:I

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->localizedDynamicPriceString:Ljava/lang/String;

    move-object/from16 v30, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->additionalFees:Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    move-object/from16 v31, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableLocationOptOut:Z

    move/from16 v32, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideWithoutLocationServices:Z

    move/from16 v33, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessReservedRideStart:Z

    move/from16 v34, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStart:Z

    move/from16 v35, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStartScanner:Z

    move/from16 v36, v14

    move/from16 v37, v15

    iget-wide v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessUpdateDistance:D

    move-wide/from16 v38, v14

    iget-wide v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBluetoothScanDuration:D

    move-wide/from16 v40, v14

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideBannerChirp:Z

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBirdCacheExpirationTimeSeconds:I

    move/from16 v42, v15

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideMaxApiScanLimit:I

    move/from16 v43, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->displayPartnerNameInRideReceipt:Z

    move/from16 v44, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->supportContactNumber:Ljava/lang/String;

    move-object/from16 v45, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoTitle:Ljava/lang/String;

    move-object/from16 v46, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoNumber:Ljava/lang/String;

    move-object/from16 v47, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalMapPins:Z

    move/from16 v48, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialButton:Z

    move/from16 v49, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialSelection:Z

    move/from16 v50, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableMapAreasByFleet:Z

    move/from16 v51, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableDetailedVehicleInfo:Z

    move/from16 v52, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryV2:Z

    move/from16 v53, v15

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->maxBirdCodeLength:I

    move/from16 v54, v15

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->minBirdCodeLength:I

    move/from16 v55, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicket:Z

    move/from16 v56, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicketAcceptFine:Z

    move/from16 v57, v15

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->outsideServiceAreaParkingTicketAmount:I

    move/from16 v58, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterBadScan:Z

    move/from16 v59, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterCancelledRide:Z

    move/from16 v60, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterLowBatteryRide:Z

    move/from16 v61, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracksByModel:Ljava/util/List;

    move-object/from16 v62, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracks:Z

    move/from16 v63, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableChirpOnScanlessRideStart:Z

    move/from16 v64, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->preferChirpAlarmOnScanlessRideStart:Z

    move/from16 v65, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryTooltip:Z

    move/from16 v66, v15

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxEntries:I

    move/from16 v67, v15

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxViews:I

    move/from16 v68, v15

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxDuration:I

    move/from16 v69, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipLocalizedCopy:Ljava/lang/String;

    move-object/from16 v70, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->showEndRideParkingRules:Z

    move/from16 v71, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableVehicleTipUi:Z

    move/from16 v72, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->useUpdatedSummaryFields:Z

    move/from16 v73, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->disableEndRidePhotoMiddleIcon:Z

    move/from16 v74, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableAndroidScanToRide:Z

    move/from16 v75, v15

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsOutsideOperatingArea:I

    move/from16 v76, v15

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsNoRideZone:I

    move/from16 v77, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartOutsideOperatingArea:Z

    move/from16 v78, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartNoRideZone:Z

    move/from16 v79, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideAccelerationRecording:Z

    move/from16 v80, v15

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->sensorSamplingPeriodUs:I

    move/from16 v81, v15

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->accelerationSampleChunkDuration:I

    move/from16 v82, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->warningConfig:Lco/bird/android/model/wire/configs/RideWarningConfig;

    move-object/from16 v83, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->smartlockConfig:Lco/bird/android/model/wire/configs/SmartlockRideConfig;

    move-object/from16 v84, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->rideLocationMode:Lco/bird/android/model/wire/configs/RideLocationMode;

    move-object/from16 v85, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->filterNestsByBird:Z

    move/from16 v86, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->mustParkInNest:Z

    move/from16 v87, v15

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->lockAckPollingIntervalSeconds:F

    move/from16 v88, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->bypassLockAckForBluetooth:Z

    move/from16 v89, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->aggressiveEndRideLock:Z

    move/from16 v90, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->safeRideStart:Lco/bird/android/model/wire/configs/SafeStartConfig;

    move-object/from16 v91, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->helmetSelfie:Lco/bird/android/model/wire/configs/HelmetSelfieConfig;

    move-object/from16 v92, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->endRide:Lco/bird/android/model/wire/configs/EndRideConfig;

    move-object/from16 v93, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->dispute:Lco/bird/android/model/wire/configs/DisputeConfig;

    move-object/from16 v94, v15

    iget v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->minRiderAge:I

    move/from16 v95, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/RideConfig;->enableShakeToReport:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v96, v15

    const-string v15, "RideConfig(basePrice="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", minutePrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", parkingFinePrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", currency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", maximumFreeRideAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", minimumUserBalance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", autoPayExpName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", autoPayRefillAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", autoPayUseFullscreenFlow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", autoPayPromptFirst="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", autoPayStartAfterRideCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", autoPayNagEveryRideCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", autoPayMandatory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", autoPayPlans="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", autoPayMandatoryMinBalance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v22

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", autoPayTitleOverride="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", enableSingleAuthForPositiveBalance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", showPriceChangeModalWithoutHistory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", priceChangeExpName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", minimumRidePrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v28

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", includedMinutes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", localizedDynamicPriceString="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", additionalFees="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", enableLocationOptOut="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableRideWithoutLocationServices="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableScanlessReservedRideStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableScanlessRideStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableScanlessRideStartScanner="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", scanlessUpdateDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v38

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", scanlessRideBluetoothScanDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v40

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", enableScanlessRideBannerChirp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", scanlessRideBirdCacheExpirationTimeSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v42

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", scanlessRideMaxApiScanLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v43

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", displayPartnerNameInRideReceipt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v44

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportContactNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", optionalLocalContactInfoTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", optionalLocalContactInfoNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v47

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", enableMultiModalMapPins="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v48

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableMultiModalTutorialButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v49

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableMultiModalTutorialSelection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v50

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableMapAreasByFleet="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v51

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableDetailedVehicleInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v52

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableScannerCodeEntryV2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v53

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", maxBirdCodeLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v54

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minBirdCodeLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v55

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", enableOutsideServiceAreaParkingTicket="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v56

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableOutsideServiceAreaParkingTicketAcceptFine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v57

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", outsideServiceAreaParkingTicketAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v58

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", enableFreeUnlockAfterBadScan="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v59

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableFreeUnlockAfterCancelledRide="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v60

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableFreeUnlockAfterLowBatteryRide="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v61

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", forceClientTracksByModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v62

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", forceClientTracks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v63

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableChirpOnScanlessRideStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v64

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", preferChirpAlarmOnScanlessRideStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v65

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableScannerCodeEntryTooltip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v66

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", scannerCodeEntryTooltipMaxEntries="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v67

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", scannerCodeEntryTooltipMaxViews="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v68

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", scannerCodeEntryTooltipMaxDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v69

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", scannerCodeEntryTooltipLocalizedCopy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v70

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", showEndRideParkingRules="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v71

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableVehicleTipUi="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v72

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", useUpdatedSummaryFields="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v73

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", disableEndRidePhotoMiddleIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v74

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableAndroidScanToRide="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v75

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", maxRideDurationSecondsOutsideOperatingArea="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v76

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxRideDurationSecondsNoRideZone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v77

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", enableRideStartOutsideOperatingArea="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v78

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableRideStartNoRideZone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v79

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableRideAccelerationRecording="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v80

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", sensorSamplingPeriodUs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v81

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", accelerationSampleChunkDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v82

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", warningConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v83

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", smartlockConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v84

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rideLocationMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v85

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", filterNestsByBird="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v86

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mustParkInNest="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v87

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", lockAckPollingIntervalSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v88

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", bypassLockAckForBluetooth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v89

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", aggressiveEndRideLock="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v90

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", safeRideStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v91

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", helmetSelfie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v92

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", endRide="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v93

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dispute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v94

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", minRiderAge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v95

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", enableShakeToReport="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v96

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->basePrice:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->minutePrice:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->parkingFinePrice:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->currency:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->maximumFreeRideAmount:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->minimumUserBalance:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayExpName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayRefillAmount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayUseFullscreenFlow:Ljava/lang/Boolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_0
    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPromptFirst:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayStartAfterRideCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayNagEveryRideCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatory:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayPlans:Ljava/util/List;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/AutoPayPlanConfig;

    invoke-virtual {v3, p1, p2}, Lco/bird/android/model/wire/configs/AutoPayPlanConfig;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_2
    :goto_2
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayMandatoryMinBalance:J

    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->autoPayTitleOverride:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableSingleAuthForPositiveBalance:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->showPriceChangeModalWithoutHistory:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->priceChangeExpName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v3, p0, Lco/bird/android/model/wire/configs/RideConfig;->minimumRidePrice:J

    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->includedMinutes:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->localizedDynamicPriceString:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->additionalFees:Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/configs/AdditionalFeesConfig;->writeToParcel(Landroid/os/Parcel;I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableLocationOptOut:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideWithoutLocationServices:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessReservedRideStart:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStart:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideStartScanner:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v3, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessUpdateDistance:D

    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v3, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBluetoothScanDuration:D

    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeDouble(D)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScanlessRideBannerChirp:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideBirdCacheExpirationTimeSeconds:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scanlessRideMaxApiScanLimit:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->displayPartnerNameInRideReceipt:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->supportContactNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoTitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->optionalLocalContactInfoNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalMapPins:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialButton:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMultiModalTutorialSelection:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableMapAreasByFleet:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableDetailedVehicleInfo:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryV2:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->maxBirdCodeLength:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->minBirdCodeLength:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicket:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableOutsideServiceAreaParkingTicketAcceptFine:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->outsideServiceAreaParkingTicketAmount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterBadScan:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterCancelledRide:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableFreeUnlockAfterLowBatteryRide:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracksByModel:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->forceClientTracks:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableChirpOnScanlessRideStart:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->preferChirpAlarmOnScanlessRideStart:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableScannerCodeEntryTooltip:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxEntries:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxViews:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipMaxDuration:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->scannerCodeEntryTooltipLocalizedCopy:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->showEndRideParkingRules:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableVehicleTipUi:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->useUpdatedSummaryFields:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->disableEndRidePhotoMiddleIcon:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableAndroidScanToRide:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsOutsideOperatingArea:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->maxRideDurationSecondsNoRideZone:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartOutsideOperatingArea:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideStartNoRideZone:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableRideAccelerationRecording:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->sensorSamplingPeriodUs:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->accelerationSampleChunkDuration:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->warningConfig:Lco/bird/android/model/wire/configs/RideWarningConfig;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/configs/RideWarningConfig;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->smartlockConfig:Lco/bird/android/model/wire/configs/SmartlockRideConfig;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/configs/SmartlockRideConfig;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->rideLocationMode:Lco/bird/android/model/wire/configs/RideLocationMode;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->filterNestsByBird:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->mustParkInNest:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->lockAckPollingIntervalSeconds:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->bypassLockAckForBluetooth:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->aggressiveEndRideLock:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->safeRideStart:Lco/bird/android/model/wire/configs/SafeStartConfig;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/configs/SafeStartConfig;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->helmetSelfie:Lco/bird/android/model/wire/configs/HelmetSelfieConfig;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/configs/HelmetSelfieConfig;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->endRide:Lco/bird/android/model/wire/configs/EndRideConfig;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/configs/EndRideConfig;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RideConfig;->dispute:Lco/bird/android/model/wire/configs/DisputeConfig;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/configs/DisputeConfig;->writeToParcel(Landroid/os/Parcel;I)V

    iget p2, p0, Lco/bird/android/model/wire/configs/RideConfig;->minRiderAge:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lco/bird/android/model/wire/configs/RideConfig;->enableShakeToReport:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
