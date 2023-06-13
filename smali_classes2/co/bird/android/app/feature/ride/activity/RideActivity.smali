.class public final Lco/bird/android/app/feature/ride/activity/RideActivity;
.super Lco/bird/android/core/map/BaseMapActivity;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/navigation/NavigationView$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/ride/activity/RideActivity$a;,
        Lco/bird/android/app/feature/ride/activity/RideActivity$b;,
        Lco/bird/android/app/feature/ride/activity/RideActivity$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e0\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u0000 \u00e3\u00022\u00020\u00012\u00020\u0002:\u0005\u00e4\u0002 \u00e5\u0002B\t\u00a2\u0006\u0006\u0008\u00e1\u0002\u0010\u00e2\u0002J\u0008\u0010\u0004\u001a\u00020\u0003H\u0002J\u001c\u0010\u0008\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0002J\u001c\u0010\n\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H\u0002J\u0012\u0010\r\u001a\u00020\u00032\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\u0010\u001a\u00020\u00032\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J*\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0008\u0010\u001a\u001a\u00020\u0003H\u0014J\u0008\u0010\u001b\u001a\u00020\u0003H\u0014J\u0008\u0010\u001c\u001a\u00020\u0003H\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016R\u001a\u0010*\u001a\u00020%8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/\"\u0004\u00080\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107\"\u0004\u00088\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008D\u0010E\u001a\u0004\u0008F\u0010G\"\u0004\u0008H\u0010IR\"\u0010Q\u001a\u00020K8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008(\u0010L\u001a\u0004\u0008M\u0010N\"\u0004\u0008O\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008S\u0010T\u001a\u0004\u0008U\u0010V\"\u0004\u0008W\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008[\u0010\\\u001a\u0004\u0008]\u0010^\"\u0004\u0008_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008c\u0010d\u001a\u0004\u0008e\u0010f\"\u0004\u0008g\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008k\u0010l\u001a\u0004\u0008m\u0010n\"\u0004\u0008o\u0010pR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008s\u0010t\u001a\u0004\u0008u\u0010v\"\u0004\u0008w\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0087.\u00a2\u0006\u0013\n\u0004\u0008{\u0010|\u001a\u0004\u0008}\u0010~\"\u0005\u0008\u007f\u0010\u0080\u0001R*\u0010\u0089\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u0083\u0001\u0010\u0084\u0001\u001a\u0006\u0008\u0085\u0001\u0010\u0086\u0001\"\u0006\u0008\u0087\u0001\u0010\u0088\u0001R*\u0010\u0091\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u008b\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u008d\u0001\u0010\u008e\u0001\"\u0006\u0008\u008f\u0001\u0010\u0090\u0001R*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001\u001a\u0006\u0008\u0095\u0001\u0010\u0096\u0001\"\u0006\u0008\u0097\u0001\u0010\u0098\u0001R)\u0010\u00a0\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0017\n\u0005\u0008\u0018\u0010\u009b\u0001\u001a\u0006\u0008\u009c\u0001\u0010\u009d\u0001\"\u0006\u0008\u009e\u0001\u0010\u009f\u0001R*\u0010\u00a8\u0001\u001a\u00030\u00a1\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001\u001a\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001\"\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001R*\u0010\u00b0\u0001\u001a\u00030\u00a9\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001\u001a\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001\"\u0006\u0008\u00ae\u0001\u0010\u00af\u0001R*\u0010\u00b8\u0001\u001a\u00030\u00b1\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00b2\u0001\u0010\u00b3\u0001\u001a\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001\"\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001R*\u0010\u00c0\u0001\u001a\u00030\u00b9\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00ba\u0001\u0010\u00bb\u0001\u001a\u0006\u0008\u00bc\u0001\u0010\u00bd\u0001\"\u0006\u0008\u00be\u0001\u0010\u00bf\u0001R*\u0010\u00c8\u0001\u001a\u00030\u00c1\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00c2\u0001\u0010\u00c3\u0001\u001a\u0006\u0008\u00c4\u0001\u0010\u00c5\u0001\"\u0006\u0008\u00c6\u0001\u0010\u00c7\u0001R*\u0010\u00d0\u0001\u001a\u00030\u00c9\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00ca\u0001\u0010\u00cb\u0001\u001a\u0006\u0008\u00cc\u0001\u0010\u00cd\u0001\"\u0006\u0008\u00ce\u0001\u0010\u00cf\u0001R*\u0010\u00d4\u0001\u001a\u00030\u00c9\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00d1\u0001\u0010\u00cb\u0001\u001a\u0006\u0008\u00d2\u0001\u0010\u00cd\u0001\"\u0006\u0008\u00d3\u0001\u0010\u00cf\u0001R*\u0010\u00d8\u0001\u001a\u00030\u00c9\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00d5\u0001\u0010\u00cb\u0001\u001a\u0006\u0008\u00d6\u0001\u0010\u00cd\u0001\"\u0006\u0008\u00d7\u0001\u0010\u00cf\u0001R*\u0010\u00dc\u0001\u001a\u00030\u00c9\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00d9\u0001\u0010\u00cb\u0001\u001a\u0006\u0008\u00da\u0001\u0010\u00cd\u0001\"\u0006\u0008\u00db\u0001\u0010\u00cf\u0001R)\u0010\u00e3\u0001\u001a\u00030\u00dd\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0017\n\u0005\u0008\u0019\u0010\u00de\u0001\u001a\u0006\u0008\u00df\u0001\u0010\u00e0\u0001\"\u0006\u0008\u00e1\u0001\u0010\u00e2\u0001R*\u0010\u00eb\u0001\u001a\u00030\u00e4\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00e5\u0001\u0010\u00e6\u0001\u001a\u0006\u0008\u00e7\u0001\u0010\u00e8\u0001\"\u0006\u0008\u00e9\u0001\u0010\u00ea\u0001R*\u0010\u00f3\u0001\u001a\u00030\u00ec\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00ed\u0001\u0010\u00ee\u0001\u001a\u0006\u0008\u00ef\u0001\u0010\u00f0\u0001\"\u0006\u0008\u00f1\u0001\u0010\u00f2\u0001R*\u0010\u00fb\u0001\u001a\u00030\u00f4\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00f5\u0001\u0010\u00f6\u0001\u001a\u0006\u0008\u00f7\u0001\u0010\u00f8\u0001\"\u0006\u0008\u00f9\u0001\u0010\u00fa\u0001R)\u0010\u0082\u0002\u001a\u00030\u00fc\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0017\n\u0005\u0008\u0004\u0010\u00fd\u0001\u001a\u0006\u0008\u00fe\u0001\u0010\u00ff\u0001\"\u0006\u0008\u0080\u0002\u0010\u0081\u0002R)\u0010\u0089\u0002\u001a\u00030\u0083\u00028\u0006@\u0006X\u0087.\u00a2\u0006\u0017\n\u0005\u0008F\u0010\u0084\u0002\u001a\u0006\u0008\u0085\u0002\u0010\u0086\u0002\"\u0006\u0008\u0087\u0002\u0010\u0088\u0002R*\u0010\u0091\u0002\u001a\u00030\u008a\u00028\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u008b\u0002\u0010\u008c\u0002\u001a\u0006\u0008\u008d\u0002\u0010\u008e\u0002\"\u0006\u0008\u008f\u0002\u0010\u0090\u0002R\u001e\u0010\u0095\u0002\u001a\u00020\u00148\u0014X\u0094\u0004\u00a2\u0006\u000f\n\u0005\u0008\u0092\u0002\u0010,\u001a\u0006\u0008\u0093\u0002\u0010\u0094\u0002R!\u0010\u009b\u0002\u001a\u00030\u0096\u00028TX\u0094\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u0097\u0002\u0010\u0098\u0002\u001a\u0006\u0008\u0099\u0002\u0010\u009a\u0002R\u001c\u0010\u009f\u0002\u001a\u0005\u0018\u00010\u009c\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009d\u0002\u0010\u009e\u0002R\u001c\u0010\u00a2\u0002\u001a\u0005\u0018\u00010\u00a0\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00e7\u0001\u0010\u00a1\u0002R\u001c\u0010\u00a5\u0002\u001a\u0005\u0018\u00010\u00a3\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00df\u0001\u0010\u00a4\u0002R\u0019\u0010\u00a7\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u008d\u0001\u0010\u00a6\u0002R\u001c\u0010\u00aa\u0002\u001a\u0005\u0018\u00010\u00a8\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b4\u0001\u0010\u00a9\u0002R\u001c\u0010\u00ae\u0002\u001a\u0005\u0018\u00010\u00ab\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ac\u0002\u0010\u00ad\u0002R\u001c\u0010\u00b2\u0002\u001a\u0005\u0018\u00010\u00af\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b0\u0002\u0010\u00b1\u0002R\u001c\u0010\u00b5\u0002\u001a\u0005\u0018\u00010\u00b3\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ef\u0001\u0010\u00b4\u0002R\u0019\u0010\u00b7\u0002\u001a\u00020\t8\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u009c\u0001\u0010\u00b6\u0002R\u001c\u0010\u00ba\u0002\u001a\u0005\u0018\u00010\u00b8\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0085\u0001\u0010\u00b9\u0002R\u001c\u0010\u00be\u0002\u001a\u0005\u0018\u00010\u00bb\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00bc\u0002\u0010\u00bd\u0002R\u0019\u0010\u00c1\u0002\u001a\u00030\u00bf\u00028\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\u0008.\u0010\u00c0\u0002R\u001b\u0010\u00c4\u0002\u001a\u0005\u0018\u00010\u00c2\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008e\u0010\u00c3\u0002R\u001c\u0010\u00c8\u0002\u001a\u0005\u0018\u00010\u00c5\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00c6\u0002\u0010\u00c7\u0002R\u001a\u0010\u00cb\u0002\u001a\u00030\u00c9\u00028\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00f7\u0001\u0010\u00ca\u0002R\u001c\u0010\u00ce\u0002\u001a\u0005\u0018\u00010\u00cc\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0085\u0002\u0010\u00cd\u0002R\u001b\u0010\u00d1\u0002\u001a\u0005\u0018\u00010\u00cf\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008]\u0010\u00d0\u0002R\u0019\u0010\u00d4\u0002\u001a\u00030\u00d2\u00028\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\u0008M\u0010\u00d3\u0002R\u001a\u0010\u00d8\u0002\u001a\u00030\u00d5\u00028\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00d6\u0002\u0010\u00d7\u0002R\u001a\u0010\u00dc\u0002\u001a\u00030\u00d9\u00028\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00da\u0002\u0010\u00db\u0002R\u001c\u0010\u00e0\u0002\u001a\u0005\u0018\u00010\u00dd\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00de\u0002\u0010\u00df\u0002\u00a8\u0006\u00e6\u0002"
    }
    d2 = {
        "Lco/bird/android/app/feature/ride/activity/RideActivity;",
        "Lco/bird/android/core/map/BaseMapActivity;",
        "Lcom/google/android/material/navigation/NavigationView$c;",
        "",
        "E0",
        "Lkotlin/Function1;",
        "LhY4;",
        "action",
        "J1",
        "LsJ4;",
        "F1",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "Landroid/content/Intent;",
        "intent",
        "onNewIntent",
        "LcD1;",
        "map",
        "onMapReady",
        "",
        "requestCode",
        "resultCode",
        "data",
        "q0",
        "A0",
        "onPause",
        "onDestroy",
        "onBackPressed",
        "Landroid/view/MenuItem;",
        "item",
        "",
        "b",
        "Landroid/view/Menu;",
        "menu",
        "onCreateOptionsMenu",
        "onOptionsItemSelected",
        "LJy;",
        "H",
        "LJy;",
        "Q",
        "()LJy;",
        "kind",
        "LBK2;",
        "I",
        "LBK2;",
        "U0",
        "()LBK2;",
        "setMapMarkerOverridesManager",
        "(LBK2;)V",
        "mapMarkerOverridesManager",
        "LL65;",
        "J",
        "LL65;",
        "u1",
        "()LL65;",
        "setRideStartedTutorialsPresenterFactory",
        "(LL65;)V",
        "rideStartedTutorialsPresenterFactory",
        "LZ95;",
        "K",
        "LZ95;",
        "B1",
        "()LZ95;",
        "setRiderModalPresenterFactory",
        "(LZ95;)V",
        "riderModalPresenterFactory",
        "Ly9;",
        "P",
        "Ly9;",
        "F0",
        "()Ly9;",
        "setAlertPresenterFactory",
        "(Ly9;)V",
        "alertPresenterFactory",
        "LF03;",
        "LF03;",
        "a1",
        "()LF03;",
        "setNavigationDrawerPresenterFactory",
        "(LF03;)V",
        "navigationDrawerPresenterFactory",
        "LmU4;",
        "R",
        "LmU4;",
        "o1",
        "()LmU4;",
        "setRideMapStartDialogPresenterFactory",
        "(LmU4;)V",
        "rideMapStartDialogPresenterFactory",
        "LI95;",
        "S",
        "LI95;",
        "Z0",
        "()LI95;",
        "setMapUiFactory",
        "(LI95;)V",
        "mapUiFactory",
        "Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;",
        "T",
        "Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;",
        "V0",
        "()Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;",
        "setMapPresenterFactory",
        "(Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;)V",
        "mapPresenterFactory",
        "LL25;",
        "U",
        "LL25;",
        "r1",
        "()LL25;",
        "setRidePresenterImplFactory",
        "(LL25;)V",
        "ridePresenterImplFactory",
        "LWJ4;",
        "W",
        "LWJ4;",
        "k1",
        "()LWJ4;",
        "setRequirementPresenterImplFactory",
        "(LWJ4;)V",
        "requirementPresenterImplFactory",
        "LAL4;",
        "X",
        "LAL4;",
        "n1",
        "()LAL4;",
        "setReservationPresenterImplFactory",
        "(LAL4;)V",
        "reservationPresenterImplFactory",
        "Ldz1;",
        "Y",
        "Ldz1;",
        "S0",
        "()Ldz1;",
        "setFreeRideDelegateFactory",
        "(Ldz1;)V",
        "freeRideDelegateFactory",
        "LHP4;",
        "Z",
        "LHP4;",
        "M0",
        "()LHP4;",
        "setBannerPresenterFactory",
        "(LHP4;)V",
        "bannerPresenterFactory",
        "LhH3;",
        "p0",
        "LhH3;",
        "f1",
        "()LhH3;",
        "setParkingPresenterImplFactory",
        "(LhH3;)V",
        "parkingPresenterImplFactory",
        "Lhs1;",
        "Lhs1;",
        "R0",
        "()Lhs1;",
        "setFlightBannerCoordinatorImplFactory",
        "(Lhs1;)V",
        "flightBannerCoordinatorImplFactory",
        "Lh54;",
        "r0",
        "Lh54;",
        "i1",
        "()Lh54;",
        "setPrivateBirdPresenterImplFactory",
        "(Lh54;)V",
        "privateBirdPresenterImplFactory",
        "LcL4;",
        "s0",
        "LcL4;",
        "l1",
        "()LcL4;",
        "setReservationPaymentIntentDelegateFactory",
        "(LcL4;)V",
        "reservationPaymentIntentDelegateFactory",
        "LKO;",
        "t0",
        "LKO;",
        "N0",
        "()LKO;",
        "setBirdPayPresenterImplFactory",
        "(LKO;)V",
        "birdPayPresenterImplFactory",
        "Lh65;",
        "u0",
        "Lh65;",
        "s1",
        "()Lh65;",
        "setRideStartInBadAreaPresenterImplFactory",
        "(Lh65;)V",
        "rideStartInBadAreaPresenterImplFactory",
        "Lva5;",
        "v0",
        "Lva5;",
        "C1",
        "()Lva5;",
        "setRiderProfilePresenterImplFactory",
        "(Lva5;)V",
        "riderProfilePresenterImplFactory",
        "Luk1;",
        "w0",
        "Luk1;",
        "y1",
        "()Luk1;",
        "setRiderMapAnnouncementPresenterFactory",
        "(Luk1;)V",
        "riderMapAnnouncementPresenterFactory",
        "x0",
        "t1",
        "setRideStartedAnnouncementPresenterFactory",
        "rideStartedAnnouncementPresenterFactory",
        "y0",
        "h1",
        "setPostRideAnnouncementPresenterFactory",
        "postRideAnnouncementPresenterFactory",
        "z0",
        "D1",
        "setSideMenuBannerAnnouncementPresenterFactory",
        "sideMenuBannerAnnouncementPresenterFactory",
        "Lbn;",
        "Lbn;",
        "L0",
        "()Lbn;",
        "setAreaManager",
        "(Lbn;)V",
        "areaManager",
        "Lgl;",
        "B0",
        "Lgl;",
        "K0",
        "()Lgl;",
        "setAppPreferences",
        "(Lgl;)V",
        "appPreferences",
        "LO01;",
        "C0",
        "LO01;",
        "Q0",
        "()LO01;",
        "setDestinationManager",
        "(LO01;)V",
        "destinationManager",
        "LpU4;",
        "D0",
        "LpU4;",
        "X0",
        "()LpU4;",
        "setMapStateManager",
        "(LpU4;)V",
        "mapStateManager",
        "LCx4;",
        "LCx4;",
        "j1",
        "()LCx4;",
        "setRentalManager",
        "(LCx4;)V",
        "rentalManager",
        "LIL2;",
        "LIL2;",
        "Y0",
        "()LIL2;",
        "setMapStyler",
        "(LIL2;)V",
        "mapStyler",
        "LP75;",
        "G0",
        "LP75;",
        "x1",
        "()LP75;",
        "setRideUi",
        "(LP75;)V",
        "rideUi",
        "H0",
        "o0",
        "()I",
        "layoutResource",
        "Lcom/google/android/gms/maps/MapView;",
        "I0",
        "Lkotlin/Lazy;",
        "n0",
        "()Lcom/google/android/gms/maps/MapView;",
        "googleMapView",
        "LN95;",
        "J0",
        "LN95;",
        "riderModalPresenter",
        "Lco/bird/android/app/feature/map/presenter/MapPresenter;",
        "Lco/bird/android/app/feature/map/presenter/MapPresenter;",
        "mapPresenter",
        "LaZ2;",
        "LaZ2;",
        "navigationDrawerPresenter",
        "LhY4;",
        "ridePresenter",
        "Lh11;",
        "Lh11;",
        "destinationPresenter",
        "LfP4;",
        "O0",
        "LfP4;",
        "bannerPresenter",
        "Lq9;",
        "P0",
        "Lq9;",
        "alertPresenter",
        "LiU4;",
        "LiU4;",
        "obstructiveUiPresenter",
        "LsJ4;",
        "requirementPresenter",
        "LfL4;",
        "LfL4;",
        "reservationPresenter",
        "LGG3;",
        "T0",
        "LGG3;",
        "parkingPresenter",
        "LZr1;",
        "LZr1;",
        "flightBannerCoordinatorPresenter",
        "LUK4;",
        "LUK4;",
        "reservationPaymentIntentDelegate",
        "LwT3;",
        "W0",
        "LwT3;",
        "pillButtonPresenter",
        "LL44;",
        "LL44;",
        "privateBirdPresenter",
        "LuO;",
        "LuO;",
        "birdPayPresenter",
        "Lka5;",
        "Lka5;",
        "riderProfilePresenter",
        "Lbz1;",
        "Lbz1;",
        "freeRideDelegate",
        "LF5;",
        "b1",
        "LF5;",
        "binding",
        "LUq6;",
        "c1",
        "LUq6;",
        "drawerFooterBinding",
        "LG95;",
        "d1",
        "LG95;",
        "mapUi",
        "<init>",
        "()V",
        "e1",
        "a",
        "c",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideActivity.kt\nco/bird/android/app/feature/ride/activity/RideActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,578:1\n1#2:579\n44#3:580\n44#3:581\n*S KotlinDebug\n*F\n+ 1 RideActivity.kt\nco/bird/android/app/feature/ride/activity/RideActivity\n*L\n184#1:580\n388#1:581\n*E\n"
    }
.end annotation


# static fields
.field public static final e1:Lco/bird/android/app/feature/ride/activity/RideActivity$a;

.field public static final f1:I


# instance fields
.field public A0:Lbn;

.field public B0:Lgl;

.field public C0:LO01;

.field public D0:LpU4;

.field public E0:LCx4;

.field public F0:LIL2;

.field public G0:LP75;

.field public final H:LJy;

.field public final H0:I

.field public I:LBK2;

.field public final I0:Lkotlin/Lazy;

.field public J:LL65;

.field public J0:LN95;

.field public K:LZ95;

.field public K0:Lco/bird/android/app/feature/map/presenter/MapPresenter;

.field public L0:LaZ2;

.field public M0:LhY4;

.field public N0:Lh11;

.field public O0:LfP4;

.field public P:Ly9;

.field public P0:Lq9;

.field public Q:LF03;

.field public Q0:LiU4;

.field public R:LmU4;

.field public R0:LsJ4;

.field public S:LI95;

.field public S0:LfL4;

.field public T:Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;

.field public T0:LGG3;

.field public U:LL25;

.field public U0:LZr1;

.field public V0:LUK4;

.field public W:LWJ4;

.field public W0:LwT3;

.field public X:LAL4;

.field public X0:LL44;

.field public Y:Ldz1;

.field public Y0:LuO;

.field public Z:LHP4;

.field public Z0:Lka5;

.field public a1:Lbz1;

.field public b1:LF5;

.field public c1:LUq6;

.field public d1:LG95;

.field public p0:LhH3;

.field public q0:Lhs1;

.field public r0:Lh54;

.field public s0:LcL4;

.field public t0:LKO;

.field public u0:Lh65;

.field public v0:Lva5;

.field public w0:Luk1;

.field public x0:Luk1;

.field public y0:Luk1;

.field public z0:Luk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/ride/activity/RideActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/ride/activity/RideActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/ride/activity/RideActivity;->e1:Lco/bird/android/app/feature/ride/activity/RideActivity$a;

    const/16 v0, 0x8

    sput v0, Lco/bird/android/app/feature/ride/activity/RideActivity;->f1:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lco/bird/android/core/map/BaseMapActivity;-><init>(Z)V

    sget-object v0, LJy;->b:LJy;

    iput-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->H:LJy;

    sget v0, Lcj4;->activity_ride:I

    iput v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->H0:I

    sget-object v0, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, Lco/bird/android/app/feature/ride/activity/RideActivity$d;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/ride/activity/RideActivity$d;-><init>(Lco/bird/android/app/feature/ride/activity/RideActivity;)V

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->I0:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic B0(Lco/bird/android/app/feature/ride/activity/RideActivity;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/ride/activity/RideActivity;->L1(Lco/bird/android/app/feature/ride/activity/RideActivity;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic C0(Lco/bird/android/app/feature/ride/activity/RideActivity;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/ride/activity/RideActivity;->I1(Lco/bird/android/app/feature/ride/activity/RideActivity;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final I1(Lco/bird/android/app/feature/ride/activity/RideActivity;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/ride/activity/RideActivity$e;

    invoke-direct {v0, p1}, Lco/bird/android/app/feature/ride/activity/RideActivity$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->F1(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final L1(Lco/bird/android/app/feature/ride/activity/RideActivity;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/ride/activity/RideActivity$f;

    invoke-direct {v0, p1}, Lco/bird/android/app/feature/ride/activity/RideActivity$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->J1(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$getMapScopeProvider(Lco/bird/android/app/feature/ride/activity/RideActivity;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->p0()Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A0(LcD1;)V
    .locals 11

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lco/bird/android/core/map/BaseMapActivity;->A0(LcD1;)V

    new-instance p1, Lco/bird/android/app/feature/ride/activity/RideActivity$k;

    invoke-direct {p1, p0}, Lco/bird/android/app/feature/ride/activity/RideActivity$k;-><init>(Lco/bird/android/app/feature/ride/activity/RideActivity;)V

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/ride/activity/RideActivity;->J1(Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->K0:Lco/bird/android/app/feature/map/presenter/MapPresenter;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->p0()Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v0

    invoke-interface {p1, v0}, Lco/bird/android/app/feature/map/presenter/MapPresenter;->onResume(Lcom/uber/autodispose/ScopeProvider;)V

    :cond_0
    iget-object p1, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->S0:LfL4;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->p0()Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v0

    invoke-interface {p1, v0}, LfL4;->onResume(Lcom/uber/autodispose/ScopeProvider;)V

    :cond_1
    iget-object p1, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->T0:LGG3;

    if-eqz p1, :cond_2

    invoke-interface {p1}, LGG3;->onResume()V

    :cond_2
    iget-object p1, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->N0:Lh11;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lh11;->onResume()V

    :cond_3
    invoke-virtual {p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->K0()Lgl;

    move-result-object p1

    invoke-virtual {p1}, Lgl;->w()Lco/bird/android/model/wire/WireRideDetail;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideDetail;->cancelled()Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Consuming last known ride"

    invoke-static {v1, v0}, Lg46;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->h1()Luk1;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->U0:LZr1;

    if-nez v1, :cond_4

    const-string v1, "flightBannerCoordinatorPresenter"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_4
    sget-object v2, Lco/bird/android/model/constant/AnnouncementContext;->POST_RIDE:Lco/bird/android/model/constant/AnnouncementContext;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideDetail;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireRide;->durationSeconds()I

    move-result v3

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideDetail;->getRating()Ljava/lang/Float;

    move-result-object v5

    new-instance p1, Lgk1$h;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xc

    const/4 v10, 0x0

    move-object v4, p1

    invoke-direct/range {v4 .. v10}, Lgk1$h;-><init>(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, v2, p1}, Luk1;->a(LZr1;Lco/bird/android/model/constant/AnnouncementContext;Lgk1$h;)Lgk1;

    :cond_5
    return-void
.end method

.method public final B1()LZ95;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->K:LZ95;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "riderModalPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final C1()Lva5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->v0:Lva5;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "riderProfilePresenterImplFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final D1()Luk1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->z0:Luk1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sideMenuBannerAnnouncementPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final E0()V
    .locals 10

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->c1:LUq6;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "drawerFooterBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, LUq6;->c:LDt6;

    iget-object v7, v0, LDt6;->b:Landroid/widget/RelativeLayout;

    const-string v0, "drawerFooterBinding.sideMenuBanner.banner"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LU03;

    iget-object v2, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    const-string v3, "binding"

    if-nez v2, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v1

    :cond_1
    iget-object v4, v2, LF5;->I:Landroidx/appcompat/widget/Toolbar;

    const-string v2, "binding.toolbar"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v2, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v1

    :cond_2
    iget-object v5, v2, LF5;->m:Landroidx/drawerlayout/widget/DrawerLayout;

    const-string v2, "binding.drawer"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v2, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v1, v2

    :goto_0
    iget-object v6, v1, LF5;->u:Lcom/guness/widget/NavigationView;

    const-string v1, "binding.navigationView"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->X()Lgl;

    move-result-object v8

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v9

    move-object v2, v0

    move-object v3, p0

    invoke-direct/range {v2 .. v9}, LU03;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroidx/appcompat/widget/Toolbar;Landroidx/drawerlayout/widget/DrawerLayout;Lcom/guness/widget/NavigationView;Landroid/view/View;Lgl;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->a1()LF03;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v2

    invoke-interface {v1, v2, v0}, LF03;->a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LN03;)LC03;

    move-result-object v1

    invoke-virtual {v0, v1}, LU03;->cm(LaZ2;)V

    invoke-virtual {v1}, LC03;->a()V

    iput-object v1, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->L0:LaZ2;

    return-void
.end method

.method public final F0()Ly9;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->P:Ly9;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "alertPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final F1(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LsJ4;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->R0:LsJ4;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    const-string v0, "requirementPresenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->S()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, LcP4;

    invoke-direct {v1, p0, p1}, LcP4;-><init>(Lco/bird/android/app/feature/ride/activity/RideActivity;Lkotlin/jvm/functions/Function1;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    return-void
.end method

.method public final J1(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LhY4;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->M0:LhY4;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    const-string v0, "ridePresenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->S()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, LdP4;

    invoke-direct {v1, p0, p1}, LdP4;-><init>(Lco/bird/android/app/feature/ride/activity/RideActivity;Lkotlin/jvm/functions/Function1;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    return-void
.end method

.method public final K0()Lgl;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->B0:Lgl;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "appPreferences"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final L0()Lbn;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->A0:Lbn;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "areaManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final M0()LHP4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->Z:LHP4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "bannerPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final N0()LKO;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->t0:LKO;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "birdPayPresenterImplFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public Q()LJy;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->H:LJy;

    return-object v0
.end method

.method public final Q0()LO01;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->C0:LO01;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "destinationManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final R0()Lhs1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->q0:Lhs1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "flightBannerCoordinatorImplFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final S0()Ldz1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->Y:Ldz1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "freeRideDelegateFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final U0()LBK2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->I:LBK2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mapMarkerOverridesManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final V0()Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->T:Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mapPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final X0()LpU4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->D0:LpU4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mapStateManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Y0()LIL2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->F0:LIL2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mapStyler"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Z0()LI95;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->S:LI95;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mapUiFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final a1()LF03;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->Q:LF03;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "navigationDrawerPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Landroid/view/MenuItem;)Z
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, LF5;->m:Landroidx/drawerlayout/widget/DrawerLayout;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->d(I)V

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->L0:LaZ2;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, LaZ2;->b(Landroid/view/MenuItem;)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f1()LhH3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->p0:LhH3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "parkingPresenterImplFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h1()Luk1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->y0:Luk1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "postRideAnnouncementPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final i1()Lh54;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->r0:Lh54;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "privateBirdPresenterImplFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final j1()LCx4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->E0:LCx4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "rentalManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k1()LWJ4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->W:LWJ4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "requirementPresenterImplFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final l1()LcL4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->s0:LcL4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "reservationPaymentIntentDelegateFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public n0()Lcom/google/android/gms/maps/MapView;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->I0:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-googleMapView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/android/gms/maps/MapView;

    return-object v0
.end method

.method public final n1()LAL4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->X:LAL4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "reservationPresenterImplFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public o0()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->H0:I

    return v0
.end method

.method public final o1()LmU4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->R:LmU4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "rideMapStartDialogPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onBackPressed()V
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    const-string v1, "binding"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    iget-object v0, v0, LF5;->m:Landroidx/drawerlayout/widget/DrawerLayout;

    const v3, 0x800003

    invoke-virtual {v0, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->C(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v0, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    iget-object v0, v2, LF5;->m:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->d(I)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->N0:Lh11;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lh11;->onBackPressed()Z

    move-result v0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_3

    move v1, v3

    :cond_3
    if-nez v1, :cond_6

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->M0:LhY4;

    if-eqz v0, :cond_5

    if-nez v0, :cond_4

    const-string v0, "ridePresenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v2, v0

    :goto_1
    invoke-interface {v2}, LhY4;->onBackPressed()Z

    move-result v0

    if-nez v0, :cond_6

    :cond_5
    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onBackPressed()V

    :cond_6
    :goto_2
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 12

    invoke-super {p0, p1}, Lco/bird/android/core/map/BaseMapActivity;->onCreate(Landroid/os/Bundle;)V

    sget p1, LVg4;->drawer:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, LF5;->a(Landroid/view/View;)LF5;

    move-result-object p1

    const-string v0, "bind(findViewById(R.id.drawer))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    sget p1, LVg4;->footerRoot:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, LUq6;->a(Landroid/view/View;)LUq6;

    move-result-object p1

    const-string v0, "bind(findViewById(R.id.footerRoot))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->c1:LUq6;

    iget-object p1, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    const-string v0, "binding"

    const/4 v1, 0x0

    if-nez p1, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v1

    :cond_0
    iget-object p1, p1, LF5;->u:Lcom/guness/widget/NavigationView;

    invoke-virtual {p1}, Lcom/guness/widget/NavigationView;->u()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, LUq6;->a(Landroid/view/View;)LUq6;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p1, LUq6;->c:LDt6;

    move-object v8, p1

    goto :goto_0

    :cond_1
    move-object v8, v1

    :goto_0
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {}, Lco/bird/android/app/feature/ride/activity/a;->a()Lco/bird/android/app/feature/ride/activity/RideActivity$c$a;

    move-result-object v2

    sget-object p1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v3

    const-string v4, "application"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v3

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v5

    const-string p1, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v6

    iget-object p1, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez p1, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v7, v1

    goto :goto_1

    :cond_2
    move-object v7, p1

    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v9

    const-string p1, "supportFragmentManager"

    invoke-static {v9, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v10

    const-string p1, "lifecycle"

    invoke-static {v10, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->x()LDQ3;

    move-result-object v11

    move-object v4, p0

    invoke-interface/range {v2 .. v11}, Lco/bird/android/app/feature/ride/activity/RideActivity$c$a;->a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LF5;LDt6;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;LDQ3;)Lco/bird/android/app/feature/ride/activity/RideActivity$c;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/app/feature/ride/activity/RideActivity$c;->a(Lco/bird/android/app/feature/ride/activity/RideActivity;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->k1()LWJ4;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->x()LDQ3;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->x1()LP75;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v7

    invoke-interface/range {v2 .. v7}, LWJ4;->a(LDQ3;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LAB1;Le13;)LTJ4;

    move-result-object p1

    invoke-virtual {p1}, LTJ4;->g0()V

    iput-object p1, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->R0:LsJ4;

    iget-object p1, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez p1, :cond_3

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v1

    :cond_3
    iget-object p1, p1, LF5;->I:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->E0()V

    invoke-virtual {p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->D1()Luk1;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/constant/AnnouncementContext;->SIDE_MENU:Lco/bird/android/model/constant/AnnouncementContext;

    new-instance v9, Lgk1$h;

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v2, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    invoke-virtual {v2}, Lco/bird/android/model/constant/MapMode;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v7, 0xb

    const/4 v8, 0x0

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lgk1$h;-><init>(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v1, v0, v9}, Luk1;->a(LZr1;Lco/bird/android/model/constant/AnnouncementContext;Lgk1$h;)Lgk1;

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, LUk4;->menu_rider_activity:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    new-instance v0, Lco/bird/android/app/feature/ride/activity/RideActivity$i;

    invoke-direct {v0, p1}, Lco/bird/android/app/feature/ride/activity/RideActivity$i;-><init>(Landroid/view/Menu;)V

    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->J1(Lkotlin/jvm/functions/Function1;)V

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onDestroy()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->R0:LsJ4;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    const-string v0, "requirementPresenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-interface {v0}, LsJ4;->onDestroy()V

    :cond_1
    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->J0:LN95;

    if-eqz v0, :cond_2

    invoke-interface {v0}, LN95;->onDestroy()V

    :cond_2
    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->M0:LhY4;

    if-eqz v0, :cond_4

    if-nez v0, :cond_3

    const-string v0, "ridePresenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v1, v0

    :goto_0
    invoke-interface {v1}, LhY4;->onDestroy()V

    :cond_4
    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->d1:LG95;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/MapUi;->onDestroy()V

    :cond_5
    invoke-super {p0}, Lco/bird/android/core/map/BaseMapActivity;->onDestroy()V

    return-void
.end method

.method public onMapReady(LcD1;)V
    .locals 29

    move-object/from16 v12, p0

    move-object/from16 v3, p1

    const-string v0, "map"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p1}, Lco/bird/android/core/map/BaseMapActivity;->onMapReady(LcD1;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->Y0()LIL2;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getRiderMapConfig()Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getPoiAnnotations()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v3, v1}, LIL2;->a(LcD1;Ljava/util/List;)V

    invoke-virtual/range {p1 .. p1}, LcD1;->l()Lxd6;

    move-result-object v0

    const/4 v13, 0x1

    invoke-virtual {v0, v13}, Lxd6;->c(Z)V

    invoke-virtual {v0, v13}, Lxd6;->a(Z)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRiderMapConfig()Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getEnableUserLocationV2()Z

    move-result v8

    new-instance v14, LxQ2;

    iget-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    const-string v15, "binding"

    const/16 v16, 0x0

    if-nez v0, :cond_0

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v0, v16

    :cond_0
    iget-object v0, v0, LF5;->I:Landroidx/appcompat/widget/Toolbar;

    const-string v1, "binding.toolbar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v1, :cond_1

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v1, v16

    :cond_1
    iget-object v1, v1, LF5;->b:Landroid/widget/ImageView;

    const-string v2, "binding.actionBarLogo"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v14, v12, v0, v1}, LxQ2;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroidx/appcompat/widget/Toolbar;Landroid/widget/ImageView;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->Z0()LI95;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->R()Ldr4;

    move-result-object v1

    invoke-interface {v1}, Ldr4;->p()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/Location;

    invoke-static {v1}, Lcm2;->d(Landroid/location/Location;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-static {v1}, Lcm2;->b(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move-object/from16 v1, v16

    :goto_0
    if-eqz v1, :cond_3

    const/high16 v2, 0x41880000    # 17.0f

    invoke-static {v1, v2}, Lcom/google/android/gms/maps/model/CameraPosition;->v(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    move-object v2, v1

    goto :goto_1

    :cond_3
    move-object/from16 v2, v16

    :goto_1
    new-instance v4, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;

    invoke-direct {v4, v3}, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;-><init>(LcD1;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->n0()Lcom/google/android/gms/maps/MapView;

    move-result-object v5

    iget-object v1, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v1, :cond_4

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v1, v16

    :cond_4
    iget-object v6, v1, LF5;->t:Landroid/widget/ImageView;

    const/4 v7, 0x1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->U0()LBK2;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getParkingConfig()Lco/bird/android/model/wire/configs/ParkingConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/ParkingConfig;->getEnableRiderParkingNestRadius()Z

    move-result v11

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    invoke-interface/range {v0 .. v11}, LI95;->a(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZZLBK2;ZZ)LH95;

    move-result-object v11

    iput-object v11, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->d1:LG95;

    new-instance v5, Lls1;

    iget-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v0, :cond_5

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v0, v16

    :cond_5
    iget-object v0, v0, LF5;->H:Lco/bird/android/widget/SingleBannerFlightView;

    const-string v1, "binding.singleBannerFlightView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v12, v0}, Lls1;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/SingleBannerFlightView;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->R0()Lhs1;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v2

    iget-object v1, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->R0:LsJ4;

    const-string v17, "requirementPresenter"

    if-nez v1, :cond_6

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v3, v16

    goto :goto_2

    :cond_6
    move-object v3, v1

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v4

    move-object/from16 v1, p0

    move-object v6, v11

    invoke-interface/range {v0 .. v6}, Lhs1;->a(Lco/bird/android/core/mvp/BaseActivity;Le13;LsJ4;Lcom/uber/autodispose/ScopeProvider;Lks1;Lco/bird/android/app/feature/map/ui/MapUi;)Lfs1;

    move-result-object v10

    iput-object v10, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->U0:LZr1;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->y1()Luk1;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/AnnouncementContext;->RIDER_MAP:Lco/bird/android/model/constant/AnnouncementContext;

    new-instance v9, Lgk1$h;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xf

    const/4 v8, 0x0

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lgk1$h;-><init>(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v10, v1, v9}, Luk1;->a(LZr1;Lco/bird/android/model/constant/AnnouncementContext;Lgk1$h;)Lgk1;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->t1()Luk1;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/AnnouncementContext;->RIDE_STARTED:Lco/bird/android/model/constant/AnnouncementContext;

    new-instance v9, Lgk1$h;

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lgk1$h;-><init>(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v10, v1, v9}, Luk1;->a(LZr1;Lco/bird/android/model/constant/AnnouncementContext;Lgk1$h;)Lgk1;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->V0()Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/map/BaseMapActivity;->p0()Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    invoke-interface {v0, v1, v11, v2, v13}, Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;->create(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/constant/MapMode;Z)Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    move-result-object v0

    iput-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->K0:Lco/bird/android/app/feature/map/presenter/MapPresenter;

    new-array v0, v13, [Lco/bird/android/model/RideState$Status;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/RideState$Status;->STARTED:Lco/bird/android/model/RideState$Status;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->mutableSetOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getRequestEndRidePhoto()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, Lco/bird/android/model/RideState$Status;->ENDED:Lco/bird/android/model/RideState$Status;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->B1()LZ95;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v2

    invoke-interface {v1, v2, v12, v0}, LZ95;->a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/core/mvp/BaseActivity;Ljava/util/Set;)LY95;

    move-result-object v0

    iput-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->J0:LN95;

    if-eqz v0, :cond_8

    invoke-interface {v0}, LN95;->a()V

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->u1()LL65;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LL65;->a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;)LK65;

    move-result-object v0

    invoke-virtual {v0}, LK65;->e()V

    new-instance v0, LLT3;

    iget-object v1, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v1, :cond_9

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v1, v16

    :cond_9
    iget-object v1, v1, LF5;->v:Lco/bird/android/widget/PillButton;

    const-string v2, "binding.onDemandButton"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LLT3;-><init>(Lco/bird/android/widget/PillButton;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->X()Lgl;

    move-result-object v22

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->F()LEa;

    move-result-object v23

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v21

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->P()Lqi1;

    move-result-object v24

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->j1()LCx4;

    move-result-object v25

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v26

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->H()LaM;

    move-result-object v27

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->R()Ldr4;

    move-result-object v28

    new-instance v1, LJT3;

    move-object/from16 v18, v1

    move-object/from16 v19, v0

    invoke-direct/range {v18 .. v28}, LJT3;-><init>(LKT3;Lcom/uber/autodispose/ScopeProvider;LTq4;Lgl;LEa;Lqi1;LCx4;Le13;LaM;Ldr4;)V

    invoke-virtual {v1}, LJT3;->o()V

    iput-object v1, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->W0:LwT3;

    new-instance v0, Lo54;

    invoke-direct {v0, v12}, Lo54;-><init>(Landroid/app/Activity;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->i1()Lh54;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lh54;->a(Lcom/uber/autodispose/ScopeProvider;Ln54;)Lg54;

    move-result-object v0

    invoke-virtual {v0}, Lg54;->B()V

    iput-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->X0:LL44;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->S0()Ldz1;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->x1()LP75;

    move-result-object v1

    invoke-interface {v0, v1, v12}, Ldz1;->a(LH31;Lco/bird/android/core/mvp/BaseActivity;)Lcz1;

    move-result-object v0

    iput-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->a1:Lbz1;

    invoke-virtual {v10}, Lfs1;->f()V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->o1()LmU4;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->x1()LP75;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, LmU4;->a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LP75;Le13;)LlU4;

    move-result-object v0

    iput-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->Q0:LiU4;

    if-eqz v0, :cond_a

    invoke-interface {v0}, LiU4;->a()V

    :cond_a
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->r1()LL25;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->x1()LP75;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->x()LDQ3;

    move-result-object v7

    iget-object v2, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->R0:LsJ4;

    if-nez v2, :cond_b

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v8, v16

    goto :goto_3

    :cond_b
    move-object v8, v2

    :goto_3
    iget-object v2, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->a1:Lbz1;

    if-nez v2, :cond_c

    const-string v2, "freeRideDelegate"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v9, v16

    goto :goto_4

    :cond_c
    move-object v9, v2

    :goto_4
    iget-object v2, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->X0:LL44;

    if-nez v2, :cond_d

    const-string v2, "privateBirdPresenter"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v13, v16

    goto :goto_5

    :cond_d
    move-object v13, v2

    :goto_5
    move-object/from16 v2, p0

    move-object v3, v11

    move-object v5, v14

    move-object v14, v10

    move-object/from16 p1, v11

    move-object v11, v13

    invoke-interface/range {v0 .. v11}, LL25;->a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/Context;LG95;LP75;LwQ2;Le13;LDQ3;LsJ4;Lbz1;LZr1;LL44;)Li25;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "intent"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Li25;->Q5(Landroid/content/Intent;)V

    iput-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->M0:LhY4;

    new-instance v19, LS11;

    iget-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v0, :cond_e

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v2, v16

    goto :goto_6

    :cond_e
    move-object v2, v0

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->R()Ldr4;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v5

    move-object/from16 v0, v19

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    invoke-direct/range {v0 .. v5}, LS11;-><init>(Landroid/app/Activity;LF5;LG95;Ldr4;LTq4;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->F()LEa;

    move-result-object v22

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->Q0()LO01;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v21

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->L0()Lbn;

    move-result-object v23

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->X0()LpU4;

    move-result-object v24

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->R()Ldr4;

    move-result-object v25

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v28

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->K0()Lgl;

    move-result-object v27

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v26

    new-instance v0, Lz11;

    move-object/from16 v18, v0

    invoke-direct/range {v18 .. v28}, Lz11;-><init>(LQ11;LO01;Lcom/uber/autodispose/ScopeProvider;LEa;Lbn;LpU4;Ldr4;Le13;Lgl;LTq4;)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "destination_latitude"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v3, "destination_longitude"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-wide/16 v4, 0x0

    invoke-virtual {v1, v2, v4, v5}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v1

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    invoke-virtual {v6, v3, v4, v5}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lz11;->F(DD)V

    :cond_f
    iput-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->N0:Lh11;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->s1()Lh65;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->x1()LP75;

    move-result-object v2

    invoke-interface {v0, v1, v14, v2}, Lh65;->a(Lcom/uber/autodispose/ScopeProvider;LZr1;LP75;)Lg65;

    move-result-object v0

    invoke-virtual {v0}, Lg65;->e()V

    new-instance v3, LHL4;

    iget-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v0, :cond_10

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v0, v16

    :cond_10
    iget-object v0, v0, LF5;->F:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    const-string v8, "binding.secondaryProgressBar"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v12, v0}, LHL4;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/ProgressBar;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->l1()LcL4;

    move-result-object v0

    invoke-interface {v0, v12, v3}, LcL4;->a(Landroidx/appcompat/app/AppCompatActivity;LGL4;)LbL4;

    move-result-object v0

    iput-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->V0:LUK4;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->n1()LAL4;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v4

    iget-object v1, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->R0:LsJ4;

    if-nez v1, :cond_11

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v5, v16

    goto :goto_7

    :cond_11
    move-object v5, v1

    :goto_7
    iget-object v7, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->V0:LUK4;

    move-object/from16 v1, p0

    move-object v6, v14

    invoke-interface/range {v0 .. v7}, LAL4;->a(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LGL4;Le13;LsJ4;LZr1;LUK4;)LyL4;

    move-result-object v0

    iput-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->S0:LfL4;

    if-eqz v0, :cond_12

    invoke-interface {v0}, LfL4;->a()V

    :cond_12
    new-instance v0, LTH3;

    iget-object v1, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v1, :cond_13

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v1, v16

    :cond_13
    iget-object v1, v1, LF5;->D:Lco/bird/android/widget/ControlButton;

    const-string v2, "binding.rideButton"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v2, :cond_14

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v2, v16

    :cond_14
    iget-object v2, v2, LF5;->x:Landroid/widget/TextView;

    const-string v3, "binding.parkingPill"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v3, :cond_15

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v3, v16

    :cond_15
    iget-object v3, v3, LF5;->w:Landroid/widget/TextView;

    const-string v4, "binding.parkingAnnoucementPill"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v12, v1, v2, v3}, LTH3;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/ControlButton;Landroid/widget/TextView;Landroid/widget/TextView;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->f1()LhH3;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v18

    invoke-static/range {p0 .. p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v1

    const-string v2, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v22

    move-object/from16 v19, v1

    move-object/from16 v20, v0

    move-object/from16 v21, p1

    move-object/from16 v23, v14

    invoke-interface/range {v17 .. v23}, LhH3;->a(Lcom/uber/autodispose/ScopeProvider;Lcom/uber/autodispose/ScopeProvider;LRH3;Lco/bird/android/app/feature/map/ui/MapParkingUi;Le13;LZr1;)LgH3;

    move-result-object v0

    invoke-virtual {v0}, LgH3;->R()V

    iput-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->T0:LGG3;

    iget-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v0, :cond_16

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v0, v16

    :cond_16
    iget-object v0, v0, LF5;->H:Lco/bird/android/widget/SingleBannerFlightView;

    sget v1, Lzi4;->bannerView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lco/bird/android/widget/BannerView;

    new-instance v1, LLP4;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->F()LEa;

    move-result-object v2

    const-string v3, "rideBannerView"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v0}, LLP4;-><init>(LEa;Lco/bird/android/widget/BannerView;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->M0()LHP4;

    move-result-object v18

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v19

    iget-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->M0:LhY4;

    if-nez v0, :cond_17

    const-string v0, "ridePresenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v20, v16

    goto :goto_8

    :cond_17
    move-object/from16 v20, v0

    :goto_8
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v22

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "ride_pass_link_code"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v21, v1

    move-object/from16 v23, v14

    invoke-interface/range {v18 .. v24}, LHP4;->a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LhY4;LKP4;Le13;LZr1;Ljava/lang/String;)LFP4;

    move-result-object v0

    invoke-virtual {v1, v0}, LLP4;->b(LfP4;)V

    invoke-virtual {v0}, LFP4;->a()V

    iput-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->O0:LfP4;

    new-instance v0, LC9;

    iget-object v1, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v1, :cond_18

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v1, v16

    :cond_18
    iget-object v1, v1, LF5;->f:Landroid/view/ViewStub;

    const-string v2, "binding.alertContainerStub"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v12, v1}, LC9;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/ViewStub;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->F0()Ly9;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ly9;->a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LB9;)Lx9;

    move-result-object v0

    iput-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->P0:Lq9;

    if-eqz v0, :cond_19

    invoke-interface {v0}, Lq9;->a()V

    :cond_19
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->N0()LKO;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-interface {v0, v1, v3, v2, v14}, LKO;->a(Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/MapBirdUi;LTq4;LZr1;)LJO;

    move-result-object v0

    invoke-virtual {v0}, LJO;->H()V

    iput-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->Y0:LuO;

    new-instance v0, Lza5;

    iget-object v1, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v1, :cond_1a

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v1, v16

    :cond_1a
    iget-object v1, v1, LF5;->H:Lco/bird/android/widget/SingleBannerFlightView;

    invoke-virtual {v1}, Lco/bird/android/widget/SingleBannerFlightView;->b()Lco/bird/android/widget/PillDropdownButton;

    move-result-object v1

    iget-object v2, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->b1:LF5;

    if-nez v2, :cond_1b

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v2, v16

    :cond_1b
    iget-object v2, v2, LF5;->F:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v12, v1, v2}, Lza5;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/PillDropdownButton;Landroid/widget/ProgressBar;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->C1()Lva5;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lva5;->a(Lya5;Lcom/uber/autodispose/ScopeProvider;)Lua5;

    move-result-object v0

    invoke-virtual {v0}, Lua5;->j()V

    iput-object v0, v12, Lco/bird/android/app/feature/ride/activity/RideActivity;->Z0:Lka5;

    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    if-eqz p1, :cond_0

    new-instance v0, Lco/bird/android/app/feature/ride/activity/RideActivity$j;

    invoke-direct {v0, p1}, Lco/bird/android/app/feature/ride/activity/RideActivity$j;-><init>(Landroid/content/Intent;)V

    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/ride/activity/RideActivity;->J1(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->M0:LhY4;

    if-nez v0, :cond_0

    const-string v0, "ridePresenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0, p1}, LhY4;->c(Landroid/view/MenuItem;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public onPause()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->M0:LhY4;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    const-string v0, "ridePresenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, LhY4;->onPause()V

    :cond_1
    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->K0:Lco/bird/android/app/feature/map/presenter/MapPresenter;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lco/bird/android/app/feature/map/presenter/MapPresenter;->onPause()V

    :cond_2
    invoke-super {p0}, Lco/bird/android/core/map/BaseMapActivity;->onPause()V

    return-void
.end method

.method public q0(IILandroid/content/Intent;LcD1;)V
    .locals 6

    const-string v0, "map"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p4, LI35;->p:LI35;

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    if-ne p1, p4, :cond_2

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "key_address"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/location/Address;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object p2, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->N0:Lh11;

    if-eqz p2, :cond_1

    new-instance p3, Lco/bird/android/model/destination/Destination;

    invoke-virtual {p1}, Landroid/location/Address;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p1}, Landroid/location/Address;->getLongitude()D

    move-result-wide v3

    const/4 p4, 0x0

    invoke-virtual {p1, p4}, Landroid/location/Address;->getAddressLine(I)Ljava/lang/String;

    move-result-object v5

    const-string p1, "address.getAddressLine(0)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p3

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/destination/Destination;-><init>(DDLjava/lang/String;)V

    invoke-interface {p2, p3}, Lh11;->a(Lco/bird/android/model/destination/Destination;)V

    :cond_1
    return-void

    :cond_2
    new-instance p4, Lco/bird/android/app/feature/ride/activity/RideActivity$g;

    invoke-direct {p4, p1, p2, p3}, Lco/bird/android/app/feature/ride/activity/RideActivity$g;-><init>(IILandroid/content/Intent;)V

    invoke-virtual {p0, p4}, Lco/bird/android/app/feature/ride/activity/RideActivity;->J1(Lkotlin/jvm/functions/Function1;)V

    new-instance p4, Lco/bird/android/app/feature/ride/activity/RideActivity$h;

    invoke-direct {p4, p1, p2, p3}, Lco/bird/android/app/feature/ride/activity/RideActivity$h;-><init>(IILandroid/content/Intent;)V

    invoke-virtual {p0, p4}, Lco/bird/android/app/feature/ride/activity/RideActivity;->F1(Lkotlin/jvm/functions/Function1;)V

    iget-object p4, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->T0:LGG3;

    if-eqz p4, :cond_3

    invoke-interface {p4, p1, p2, p3}, LGG3;->onActivityResult(IILandroid/content/Intent;)V

    :cond_3
    return-void
.end method

.method public final r1()LL25;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->U:LL25;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "ridePresenterImplFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final s1()Lh65;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->u0:Lh65;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "rideStartInBadAreaPresenterImplFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final t1()Luk1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->x0:Luk1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "rideStartedAnnouncementPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final u1()LL65;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->J:LL65;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "rideStartedTutorialsPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final x1()LP75;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->G0:LP75;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "rideUi"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final y1()Luk1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RideActivity;->w0:Luk1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "riderMapAnnouncementPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
