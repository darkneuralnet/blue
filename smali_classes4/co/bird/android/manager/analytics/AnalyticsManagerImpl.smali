.class public final Lco/bird/android/manager/analytics/AnalyticsManagerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEa;
.implements Lbr4;
.implements LFq2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/manager/analytics/AnalyticsManagerImpl$b;,
        Lco/bird/android/manager/analytics/AnalyticsManagerImpl$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 \u00d7\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002[_B\u00ef\u0001\u0008\u0007\u0012\u0006\u0010]\u001a\u00020Z\u0012\u0006\u0010a\u001a\u00020^\u0012\u0006\u0010d\u001a\u00020b\u0012\u0006\u0010h\u001a\u00020e\u0012\u0006\u0010k\u001a\u00020i\u0012\u0006\u0010o\u001a\u00020l\u0012\u0006\u0010s\u001a\u00020p\u0012\u0008\u0008\u0001\u0010w\u001a\u00020t\u0012\u0006\u0010{\u001a\u00020x\u0012\u0006\u0010\u007f\u001a\u00020|\u0012\u0008\u0010\u0083\u0001\u001a\u00030\u0080\u0001\u0012\u0007\u0010\u0086\u0001\u001a\u00020+\u0012\u0008\u0010\u008a\u0001\u001a\u00030\u0087\u0001\u0012\u0008\u0010\u008e\u0001\u001a\u00030\u008b\u0001\u0012\u0008\u0010\u0092\u0001\u001a\u00030\u008f\u0001\u0012\u0008\u0010\u0096\u0001\u001a\u00030\u0093\u0001\u0012\u0008\u0010\u009a\u0001\u001a\u00030\u0097\u0001\u0012\u0008\u0010\u009e\u0001\u001a\u00030\u009b\u0001\u0012\u0008\u0010\u00a2\u0001\u001a\u00030\u009f\u0001\u0012\u0008\u0010\u00a6\u0001\u001a\u00030\u00a3\u0001\u0012\u0008\u0010\u00a9\u0001\u001a\u00030\u00a7\u0001\u0012\u0008\u0010\u00ac\u0001\u001a\u00030\u00aa\u0001\u0012\u000f\u0010\u00b0\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ae\u00010\u00ad\u0001\u0012\u0008\u0010\u00b3\u0001\u001a\u00030\u00b1\u0001\u00a2\u0006\u0006\u0008\u00d5\u0001\u0010\u00d6\u0001J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0008\u0010\u0008\u001a\u00020\u0006H\u0002J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0002J\u000c\u0010\u0013\u001a\u00020\u0012*\u00020\u0010H\u0002J\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0010H\u0002J\u001c\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0016*\u00020\u0010H\u0002J\u000c\u0010\u001a\u001a\u00020\u0019*\u00020\u0010H\u0002J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0002J\u000c\u0010\u001c\u001a\u00020\u0012*\u00020\u0014H\u0002J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0002J\u001e\u0010\u001f\u001a\u00020\u00062\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0002J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020 2\u0006\u0010\"\u001a\u00020!H\u0002J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0003J\u0008\u0010\'\u001a\u00020\u0006H\u0003J(\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016*\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0002J(\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016*\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0002J\u000c\u0010*\u001a\u00020\u0014*\u00020\u0012H\u0002J\u000e\u0010,\u001a\u0004\u0018\u00010\u0014*\u00020+H\u0003J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0002J\u0008\u0010.\u001a\u00020\u0012H\u0002J\u0011\u0010/\u001a\u0004\u0018\u00010!H\u0002\u00a2\u0006\u0004\u0008/\u00100J\u0019\u00102\u001a\u0004\u0018\u00010!2\u0006\u00101\u001a\u00020\u0012H\u0003\u00a2\u0006\u0004\u00082\u00103J\u0011\u00105\u001a\u0004\u0018\u000104H\u0002\u00a2\u0006\u0004\u00085\u00106J\u0011\u00107\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0004\u00087\u00108J0\u0010>\u001a\u00020\u00062\u0006\u0010:\u001a\u0002092\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00162\u0008\u0010=\u001a\u0004\u0018\u00010<H\u0016J8\u0010A\u001a\u00020\u00062\u0006\u0010:\u001a\u0002092\u0006\u0010?\u001a\u00020\u00142\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00162\u0008\u0010@\u001a\u0004\u0018\u00010<H\u0016J.\u0010C\u001a\u00020\u00122\u0006\u0010:\u001a\u0002092\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00162\u0006\u0010B\u001a\u00020!H\u0016J\u0010\u0010D\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016J\u0010\u0010E\u001a\u00020\u00122\u0006\u0010:\u001a\u000209H\u0016J\u0010\u0010F\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016J!\u0010H\u001a\u00020\u0006\"\u0008\u0008\u0000\u0010G*\u00020\u00102\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008H\u0010IJ\u0008\u0010J\u001a\u00020\u000bH\u0016J\u0010\u0010M\u001a\u00020\u00062\u0006\u0010L\u001a\u00020KH\u0016J\u0018\u0010Q\u001a\u00020\u00062\u0006\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u00020\u0012H\u0016J\u000f\u0010R\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008R\u0010SJ\u0008\u0010T\u001a\u00020\u0006H\u0016J\u0008\u0010U\u001a\u00020\u0019H\u0016J\u0008\u0010V\u001a\u00020\u0006H\u0016J\u0008\u0010W\u001a\u00020\u0006H\u0016J\u0008\u0010X\u001a\u00020\u0006H\u0007J\u0008\u0010Y\u001a\u00020\u0006H\u0007R\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008_\u0010`R\u0014\u0010d\u001a\u00020b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008f\u0010gR\u0014\u0010k\u001a\u00020i8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008m\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008q\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008u\u0010vR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008y\u0010zR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0086\u0001\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0093\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u00a2\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001R\u0018\u0010\u00a6\u0001\u001a\u00030\u00a3\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001R\u0017\u0010\u00a9\u0001\u001a\u00030\u00a7\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008E\u0010\u00a8\u0001R\u0017\u0010\u00ac\u0001\u001a\u00030\u00aa\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008A\u0010\u00ab\u0001R\u001e\u0010\u00b0\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ae\u00010\u00ad\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008M\u0010\u00af\u0001R\u0017\u0010\u00b3\u0001\u001a\u00030\u00b1\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008H\u0010\u00b2\u0001R\u0017\u0010\u00b6\u0001\u001a\u00030\u00b4\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008>\u0010\u00b5\u0001R&\u0010\u00bc\u0001\u001a\u0011\u0012\u000c\u0012\n\u0012\u0005\u0012\u00030\u00b9\u00010\u00b8\u00010\u00b7\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ba\u0001\u0010\u00bb\u0001R\u0018\u0010\u00c0\u0001\u001a\u00030\u00bd\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00be\u0001\u0010\u00bf\u0001R\u0018\u0010\u00c2\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008J\u0010\u00c1\u0001R\u0017\u0010\u00c3\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008T\u0010DR$\u0010\u00c7\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020<0\u00c4\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c5\u0001\u0010\u00c6\u0001R,\u0010\u00cd\u0001\u001a\u0017\u0012\u0004\u0012\u00020\u0014\u0012\u000c\u0012\n\u0012\u0005\u0012\u00030\u00ca\u00010\u00c9\u00010\u00c8\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00cb\u0001\u0010\u00cc\u0001R%\u0010\u00ce\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010<0\u00c8\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008C\u0010\u00cc\u0001R?\u0010\u00d4\u0001\u001a\"\u0012\u001d\u0012\u001b\u0012\u0005\u0012\u00030\u00b9\u0001 \u00d0\u0001*\u000c\u0012\u0005\u0012\u00030\u00b9\u0001\u0018\u00010\u00b8\u00010\u00b8\u00010\u00cf\u00018VX\u0096\u0084\u0002\u00a2\u0006\u000f\n\u0006\u0008\u00d1\u0001\u0010\u00d2\u0001\u001a\u0005\u0008f\u0010\u00d3\u0001\u00a8\u0006\u00d8\u0001"
    }
    d2 = {
        "Lco/bird/android/manager/analytics/AnalyticsManagerImpl;",
        "LEa;",
        "Lbr4;",
        "LFq2;",
        "Lco/bird/android/model/User;",
        "user",
        "",
        "w1",
        "z1",
        "Lco/bird/android/model/persistence/AnalyticsEntity;",
        "event",
        "Lio/reactivex/c;",
        "s0",
        "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;",
        "legacyEvent",
        "Q1",
        "Lco/bird/android/model/analytics/AnalyticsEvent;",
        "U1",
        "",
        "i1",
        "",
        "v0",
        "",
        "",
        "g1",
        "",
        "h1",
        "V1",
        "x1",
        "W1",
        "properties",
        "P1",
        "Lco/bird/android/model/analytics/RecurrentNthEvent;",
        "",
        "count",
        "O1",
        "Landroid/content/Context;",
        "context",
        "E1",
        "B1",
        "q1",
        "r1",
        "L1",
        "Landroid/net/ConnectivityManager;",
        "k1",
        "o0",
        "y1",
        "v1",
        "()Ljava/lang/Integer;",
        "accessCoarseLocationPermissionGranted",
        "s1",
        "(Z)Ljava/lang/Integer;",
        "",
        "u1",
        "()Ljava/lang/Double;",
        "t1",
        "()Ljava/lang/Long;",
        "Lco/bird/android/model/analytics/TraceKey;",
        "key",
        "attributes",
        "Lorg/joda/time/DateTime;",
        "startTimeOverride",
        "z",
        "keySuffix",
        "stopTimeOverride",
        "w",
        "throttleMillis",
        "G",
        "J",
        "v",
        "N",
        "T",
        "y",
        "(Lco/bird/android/model/analytics/AnalyticsEvent;)V",
        "C",
        "Lco/bird/android/model/analytics/PersistentPropertyEntry;",
        "entry",
        "x",
        "Landroid/app/Application;",
        "app",
        "isDebug",
        "d",
        "M1",
        "()V",
        "D",
        "f",
        "P",
        "O",
        "onAppForeground",
        "onAppBackground",
        "LOh;",
        "b",
        "LOh;",
        "buildConfig",
        "LZ9;",
        "c",
        "LZ9;",
        "client",
        "Lab;",
        "Lab;",
        "unauthenticatedClient",
        "Lgl;",
        "e",
        "Lgl;",
        "preference",
        "Ll20;",
        "Ll20;",
        "brazeManager",
        "Lde5;",
        "g",
        "Lde5;",
        "rxBleClient",
        "LBc;",
        "h",
        "LBc;",
        "deviceManager",
        "LLifecycleOwner;",
        "i",
        "LLifecycleOwner;",
        "processLifecycleOwner",
        "LTq4;",
        "j",
        "LTq4;",
        "reactiveConfig",
        "LuQ3;",
        "k",
        "LuQ3;",
        "permissionDelegate",
        "LGI3;",
        "l",
        "LGI3;",
        "partnerManager",
        "m",
        "Landroid/net/ConnectivityManager;",
        "connectivityManager",
        "Lo21;",
        "n",
        "Lo21;",
        "deviceCheckManager",
        "Landroid/app/admin/DevicePolicyManager;",
        "o",
        "Landroid/app/admin/DevicePolicyManager;",
        "devicePolicyManager",
        "Landroid/net/wifi/WifiManager;",
        "p",
        "Landroid/net/wifi/WifiManager;",
        "wifiManager",
        "Landroid/telephony/TelephonyManager;",
        "q",
        "Landroid/telephony/TelephonyManager;",
        "telephonyManager",
        "Lco/bird/android/manager/analytics/persistence/AnalyticsDatabase;",
        "r",
        "Lco/bird/android/manager/analytics/persistence/AnalyticsDatabase;",
        "analyticsDatabase",
        "Li66;",
        "s",
        "Li66;",
        "traceProvider",
        "LRh6;",
        "t",
        "LRh6;",
        "userStream",
        "Llj1;",
        "u",
        "Llj1;",
        "facebookManager",
        "Lwm1;",
        "Lwm1;",
        "firebaseAnalyticsManager",
        "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;",
        "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;",
        "firebaseCrashlytics",
        "Ldagger/Lazy;",
        "LZC6;",
        "Ldagger/Lazy;",
        "workManager",
        "Ldr4;",
        "Ldr4;",
        "locationManager",
        "Lio/reactivex/disposables/b;",
        "Lio/reactivex/disposables/b;",
        "trash",
        "La94;",
        "",
        "Lco/bird/android/model/analytics/AnalyticsDebugEvent;",
        "A",
        "La94;",
        "trackedEventsRelay",
        "Lda;",
        "B",
        "Lda;",
        "analyticsDao",
        "Z",
        "applicationLaunched",
        "lastResumedTime",
        "Landroid/util/LruCache;",
        "E",
        "Landroid/util/LruCache;",
        "brazeThrottleCache",
        "",
        "Ljava/util/concurrent/ConcurrentLinkedDeque;",
        "Lf66;",
        "F",
        "Ljava/util/Map;",
        "traceKeyStacks",
        "traceKeyThrottleTimes",
        "LZ84;",
        "kotlin.jvm.PlatformType",
        "H",
        "Lkotlin/Lazy;",
        "()LZ84;",
        "trackedEventsObservable",
        "<init>",
        "(LOh;LZ9;Lab;Lgl;Ll20;Lde5;LBc;LLifecycleOwner;LTq4;LuQ3;LGI3;Landroid/net/ConnectivityManager;Lo21;Landroid/app/admin/DevicePolicyManager;Landroid/net/wifi/WifiManager;Landroid/telephony/TelephonyManager;Lco/bird/android/manager/analytics/persistence/AnalyticsDatabase;Li66;LRh6;Llj1;Lwm1;Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Ldagger/Lazy;Ldr4;)V",
        "I",
        "analytics_release"
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
        "SMAP\nAnalyticsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsManagerImpl.kt\nco/bird/android/manager/analytics/AnalyticsManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,879:1\n180#2:880\n180#2:881\n1#3:882\n215#4,2:883\n215#4,2:888\n215#4,2:890\n2624#5,3:885\n1238#5,4:894\n1238#5,4:900\n288#5,2:904\n442#6:892\n392#6:893\n442#6:898\n392#6:899\n*S KotlinDebug\n*F\n+ 1 AnalyticsManagerImpl.kt\nco/bird/android/manager/analytics/AnalyticsManagerImpl\n*L\n220#1:880\n243#1:881\n637#1:883,2\n659#1:888,2\n671#1:890,2\n651#1:885,3\n728#1:894,4\n738#1:900,4\n815#1:904,2\n728#1:892\n728#1:893\n738#1:898\n738#1:899\n*E\n"
    }
.end annotation


# static fields
.field public static final I:Lco/bird/android/manager/analytics/AnalyticsManagerImpl$c;

.field public static final J:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final K:I

.field public static final P:I

.field public static final Q:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final R:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/List<",
            "Lco/bird/android/model/analytics/AnalyticsDebugEvent;",
            ">;>;"
        }
    .end annotation
.end field

.field public final B:Lda;

.field public C:Z

.field public D:J

.field public final E:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            ">;"
        }
    .end annotation
.end field

.field public final F:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Lf66;",
            ">;>;"
        }
    .end annotation
.end field

.field public final G:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            ">;"
        }
    .end annotation
.end field

.field public final H:Lkotlin/Lazy;

.field public final b:LOh;

.field public final c:LZ9;

.field public final d:Lab;

.field public final e:Lgl;

.field public final f:Ll20;

.field public final g:Lde5;

.field public final h:LBc;

.field public final i:LLifecycleOwner;

.field public final j:LTq4;

.field public final k:LuQ3;

.field public final l:LGI3;

.field public final m:Landroid/net/ConnectivityManager;

.field public final n:Lo21;

.field public final o:Landroid/app/admin/DevicePolicyManager;

.field public final p:Landroid/net/wifi/WifiManager;

.field public final q:Landroid/telephony/TelephonyManager;

.field public final r:Lco/bird/android/manager/analytics/persistence/AnalyticsDatabase;

.field public final s:Li66;

.field public final t:LRh6;

.field public final u:Llj1;

.field public final v:Lwm1;

.field public final w:Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

.field public final x:Ldagger/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/Lazy<",
            "LZC6;",
            ">;"
        }
    .end annotation
.end field

.field public final y:Ldr4;

.field public final z:Lio/reactivex/disposables/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 17

    new-instance v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->I:Lco/bird/android/manager/analytics/AnalyticsManagerImpl$c;

    const-string v0, "OperatorActivity"

    const-string v1, "ChargerActivity"

    const-string v2, "RideActivity"

    const-string v3, "MagicLinkIntroActivity"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->J:Ljava/util/List;

    const/16 v0, 0x28

    sput v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->K:I

    sput v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->P:I

    const-string v1, "platform"

    const-string v2, "app_version"

    const-string v3, "os_version"

    const-string v4, "mobile_network_generation"

    const-string v5, "battery_level"

    const-string v6, "heading"

    const-string v7, "accuracy"

    const-string v8, "app_name"

    const-string v9, "user_interface_style"

    const-string v10, "is_managed_device"

    const-string v11, "memory_usage"

    const-string v12, "max_memory_available"

    const-string v13, "device_id_str"

    const-string v14, "device_model"

    const-string v15, "app_build"

    const-string v16, "app_language"

    filled-new-array/range {v1 .. v16}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->Q:Ljava/util/Set;

    const-string v0, "longitude"

    const-string v1, "email"

    const-string v2, "latitude"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->R:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(LOh;LZ9;Lab;Lgl;Ll20;Lde5;LBc;LLifecycleOwner;LTq4;LuQ3;LGI3;Landroid/net/ConnectivityManager;Lo21;Landroid/app/admin/DevicePolicyManager;Landroid/net/wifi/WifiManager;Landroid/telephony/TelephonyManager;Lco/bird/android/manager/analytics/persistence/AnalyticsDatabase;Li66;LRh6;Llj1;Lwm1;Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Ldagger/Lazy;Ldr4;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOh;",
            "LZ9;",
            "Lab;",
            "Lgl;",
            "Ll20;",
            "Lde5;",
            "LBc;",
            "LLifecycleOwner;",
            "LTq4;",
            "LuQ3;",
            "LGI3;",
            "Landroid/net/ConnectivityManager;",
            "Lo21;",
            "Landroid/app/admin/DevicePolicyManager;",
            "Landroid/net/wifi/WifiManager;",
            "Landroid/telephony/TelephonyManager;",
            "Lco/bird/android/manager/analytics/persistence/AnalyticsDatabase;",
            "Li66;",
            "LRh6;",
            "Llj1;",
            "Lwm1;",
            "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;",
            "Ldagger/Lazy<",
            "LZC6;",
            ">;",
            "Ldr4;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v0, p16

    const-string v0, "buildConfig"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unauthenticatedClient"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preference"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brazeManager"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxBleClient"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceManager"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processLifecycleOwner"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionDelegate"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "partnerManager"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectivityManager"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceCheckManager"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "devicePolicyManager"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiManager"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "telephonyManager"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsDatabase"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "traceProvider"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "facebookManager"

    move-object/from16 v15, p20

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firebaseAnalyticsManager"

    move-object/from16 v15, p21

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firebaseCrashlytics"

    move-object/from16 v15, p22

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workManager"

    move-object/from16 v15, p23

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    move-object/from16 v15, p24

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v15, p16

    iput-object v1, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->b:LOh;

    iput-object v2, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->c:LZ9;

    iput-object v3, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->d:Lab;

    iput-object v4, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->e:Lgl;

    iput-object v5, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->f:Ll20;

    iput-object v6, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->g:Lde5;

    iput-object v7, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->h:LBc;

    iput-object v8, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->i:LLifecycleOwner;

    iput-object v9, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->j:LTq4;

    iput-object v10, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->k:LuQ3;

    iput-object v11, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->l:LGI3;

    iput-object v12, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->m:Landroid/net/ConnectivityManager;

    iput-object v13, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->n:Lo21;

    iput-object v14, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->o:Landroid/app/admin/DevicePolicyManager;

    move-object/from16 v2, p15

    iput-object v2, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->p:Landroid/net/wifi/WifiManager;

    iput-object v15, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->q:Landroid/telephony/TelephonyManager;

    move-object/from16 v2, p17

    move-object/from16 v3, p18

    iput-object v2, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->r:Lco/bird/android/manager/analytics/persistence/AnalyticsDatabase;

    iput-object v3, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->s:Li66;

    move-object/from16 v3, p19

    move-object/from16 v4, p20

    iput-object v3, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->t:LRh6;

    iput-object v4, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->u:Llj1;

    move-object/from16 v4, p21

    move-object/from16 v5, p22

    iput-object v4, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->v:Lwm1;

    iput-object v5, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->w:Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    move-object/from16 v4, p23

    move-object/from16 v5, p24

    iput-object v4, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->x:Ldagger/Lazy;

    iput-object v5, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->y:Ldr4;

    new-instance v4, Lio/reactivex/disposables/b;

    invoke-direct {v4}, Lio/reactivex/disposables/b;-><init>()V

    iput-object v4, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->z:Lio/reactivex/disposables/b;

    sget-object v4, La94;->h:La94$a;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-static {v4, v5, v6, v7, v6}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v4

    iput-object v4, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->A:La94;

    invoke-virtual/range {p17 .. p17}, Lco/bird/android/manager/analytics/persistence/AnalyticsDatabase;->C()Lda;

    move-result-object v2

    iput-object v2, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->B:Lda;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->D:J

    new-instance v2, Landroid/util/LruCache;

    const/16 v4, 0x64

    invoke-direct {v2, v4}, Landroid/util/LruCache;-><init>(I)V

    iput-object v2, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->E:Landroid/util/LruCache;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->F:Ljava/util/Map;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->G:Ljava/util/Map;

    new-instance v2, Lco/bird/android/model/analytics/AppName;

    invoke-interface/range {p1 .. p1}, LOh;->f()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lco/bird/android/model/analytics/AppName;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->x(Lco/bird/android/model/analytics/PersistentPropertyEntry;)V

    invoke-interface/range {p19 .. p19}, LRh6;->c()Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string v3, "UNBOUND"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$a;

    invoke-direct {v2, v0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$a;-><init>(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)V

    new-instance v3, LKa;

    invoke-direct {v3, v2}, LKa;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v1, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->z1()V

    new-instance v1, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$n;

    invoke-direct {v1, v0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$n;-><init>(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->H:Lkotlin/Lazy;

    return-void
.end method

.method public static final A1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final C1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final D1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final F1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final G1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final K1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final N1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->K1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final R1(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final S1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->S1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final T1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->G1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->u0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->N1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getAnalyticsDao$p(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)Lda;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->B:Lda;

    return-object p0
.end method

.method public static final synthetic access$getCOLD_START_FINAL_ACTIVITY_LIST$cp()Ljava/util/List;
    .locals 1

    sget-object v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->J:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getClient$p(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)LZ9;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->c:LZ9;

    return-object p0
.end method

.method public static final synthetic access$getFIREBASE_EXCLUDED_KEYS$cp()Ljava/util/Set;
    .locals 1

    sget-object v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->Q:Ljava/util/Set;

    return-object v0
.end method

.method public static final synthetic access$getPreference$p(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)Lgl;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->e:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getTrackedEventsRelay$p(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->A:La94;

    return-object p0
.end method

.method public static final synthetic access$getUnauthenticatedClient$p(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)Lab;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->d:Lab;

    return-object p0
.end method

.method public static final synthetic access$getUserStream$p(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)LRh6;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->t:LRh6;

    return-object p0
.end method

.method public static final synthetic access$getWorkManager$p(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)Ldagger/Lazy;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->x:Ldagger/Lazy;

    return-object p0
.end method

.method public static final synthetic access$handleLogin(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;Lco/bird/android/model/User;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->w1(Lco/bird/android/model/User;)V

    return-void
.end method

.method public static synthetic c0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->F1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e0(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->R1(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->D1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->n0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->T1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j0(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->t0(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->C1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->A1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final n0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final t0(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)Lio/reactivex/K;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->B:Lda;

    invoke-virtual {p0}, Lda;->b()Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final u0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final B1()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->g:Lde5;

    invoke-virtual {v0}, Lde5;->d()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->g:Lde5;

    invoke-virtual {v1}, Lde5;->c()Lde5$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$g;

    invoke-direct {v1, p0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$g;-><init>(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)V

    new-instance v2, LIa;

    invoke-direct {v2, v1}, LIa;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v1, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$h;->b:Lco/bird/android/manager/analytics/AnalyticsManagerImpl$h;

    new-instance v3, LJa;

    invoke-direct {v3, v1}, LJa;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public C()Lio/reactivex/c;
    .locals 3

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->B:Lda;

    invoke-virtual {v0}, Lda;->c()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$k;

    invoke-direct {v1, p0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$k;-><init>(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)V

    new-instance v2, LGa;

    invoke-direct {v2, v1}, LGa;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$l;

    invoke-direct {v1, p0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$l;-><init>(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)V

    new-instance v2, LHa;

    invoke-direct {v2, v1}, LHa;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object v0

    const-string v1, "override fun submitStore\u2026     .ignoreElement()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public D()V
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->D:J

    return-void
.end method

.method public final E1(Landroid/content/Context;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult, MissingPermission"
        }
    .end annotation

    invoke-static {p1}, LQr4;->d(Landroid/content/Context;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$i;

    invoke-direct {v0, p0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$i;-><init>(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)V

    new-instance v1, LRa;

    invoke-direct {v1, v0}, LRa;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$j;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl$j;

    new-instance v2, LSa;

    invoke-direct {v2, v0}, LSa;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public G(Lco/bird/android/model/analytics/TraceKey;Ljava/util/Map;I)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/analytics/TraceKey;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;I)Z"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->G:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/TraceKey;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/joda/time/DateTime;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p3}, Lorg/joda/time/DateTime;->plusMillis(I)Lorg/joda/time/DateTime;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->isAfterNow()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->F:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/TraceKey;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ConcurrentLinkedDeque;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf66;

    :cond_2
    iget-object v1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->F:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/TraceKey;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->F:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/TraceKey;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    new-instance v1, Lf66;

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v3

    const-string v4, "now()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->s:Li66;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/TraceKey;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Li66;->a(Ljava/lang/String;)Lb66;

    move-result-object v4

    invoke-direct {v1, v3, v4, p2}, Lf66;-><init>(Lorg/joda/time/DateTime;Lb66;Ljava/util/Map;)V

    iget-object p2, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->F:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/TraceKey;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/ConcurrentLinkedDeque;

    if-eqz p2, :cond_4

    invoke-virtual {p2, v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->push(Ljava/lang/Object;)V

    :cond_4
    invoke-virtual {v1}, Lf66;->c()Lb66;

    move-result-object p2

    invoke-interface {p2}, Lb66;->start()Lb66;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/TraceKey;->getName()Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Trace started for "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p2, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p2, 0x1

    if-eqz v0, :cond_5

    invoke-virtual {v0, p3}, Lorg/joda/time/DateTime;->plusMillis(I)Lorg/joda/time/DateTime;

    move-result-object p3

    if-eqz p3, :cond_5

    invoke-virtual {p3}, Lorg/joda/time/base/AbstractInstant;->isBeforeNow()Z

    move-result p3

    if-nez p3, :cond_5

    move v2, p2

    :cond_5
    if-nez v2, :cond_6

    iget-object p3, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->G:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/TraceKey;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-interface {p3, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return p2
.end method

.method public H1(Lio/reactivex/c;)Lio/reactivex/c;
    .locals 0

    invoke-static {p0, p1}, Lbr4$a;->m(Lbr4;Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public I1(Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Observable<",
            "TT;>;)",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lbr4$a;->o(Lbr4;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public J(Lco/bird/android/model/analytics/TraceKey;)V
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->F:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/TraceKey;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final L1(Z)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    const-string p1, "authorized"

    goto :goto_0

    :cond_0
    const-string p1, "denied"

    :goto_0
    return-object p1
.end method

.method public final M1()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->e:Lgl;

    invoke-virtual {v1}, Lgl;->v0()I

    move-result v1

    iget-object v2, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->e:Lgl;

    invoke-virtual {v2}, Lgl;->U0()V

    if-nez v1, :cond_0

    new-instance v1, Lem;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Lem;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_0
    new-instance v1, Lhm;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x1f

    const/16 v16, 0x0

    move-object v9, v1

    invoke-direct/range {v9 .. v16}, Lhm;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V
    .locals 3

    const-string v0, "legacyEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lco/bird/android/model/analytics/RecurrentNthEvent;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/bird/android/model/analytics/RecurrentNthEvent;

    iget-object v1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->e:Lgl;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgl;->T0(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->O1(Lco/bird/android/model/analytics/RecurrentNthEvent;I)V

    :cond_0
    instance-of v0, p1, Lco/bird/android/model/analytics/UserPropertyProvider;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lco/bird/android/model/analytics/UserPropertyProvider;

    invoke-interface {v0}, Lco/bird/android/model/analytics/UserPropertyProvider;->getUserProperty()Lco/bird/android/model/analytics/PersistentPropertyEntry;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->x(Lco/bird/android/model/analytics/PersistentPropertyEntry;)V

    :cond_1
    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->o0(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->Q1(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->U1(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->V1(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->W1(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public O()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->z:Lio/reactivex/disposables/b;

    invoke-virtual {v0}, Lio/reactivex/disposables/b;->dispose()V

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->z:Lio/reactivex/disposables/b;

    invoke-virtual {v0}, Lio/reactivex/disposables/b;->d()V

    return-void
.end method

.method public final O1(Lco/bird/android/model/analytics/RecurrentNthEvent;I)V
    .locals 0

    invoke-interface {p1, p2}, Lco/bird/android/model/analytics/RecurrentNthEvent;->nthEvent(I)Lco/bird/android/model/analytics/LegacyAnalyticsEvent;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    :cond_0
    return-void
.end method

.method public P()V
    .locals 0

    return-void
.end method

.method public final P1(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->r1(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->v:Lwm1;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Lwm1;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->w:Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lcom/google/firebase/crashlytics/FirebaseCrashlytics;->setCustomKey(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final Q1(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V
    .locals 10

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->c:LZ9;

    new-instance v1, Lco/bird/api/request/LegacyCreateAnalyticsEventsBody;

    new-instance v9, Lco/bird/android/model/LegacyAnalyticsEventData;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v7, 0x9

    const/4 v8, 0x0

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lco/bird/android/model/LegacyAnalyticsEventData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v1, p1}, Lco/bird/api/request/LegacyCreateAnalyticsEventsBody;-><init>(Ljava/util/List;)V

    invoke-interface {v0, v1}, LZ9;->a(Lco/bird/api/request/LegacyCreateAnalyticsEventsBody;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, LLa;

    invoke-direct {v0}, LLa;-><init>()V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "client\n      .trackLegac\u2026s))))\n      .map { true }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->I1(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$o;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl$o;

    new-instance v1, LMa;

    invoke-direct {v1, v0}, LMa;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$p;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl$p;

    new-instance v2, LNa;

    invoke-direct {v2, v0}, LNa;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final U1(Lco/bird/android/model/analytics/AnalyticsEvent;)V
    .locals 4

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->h1(Lco/bird/android/model/analytics/AnalyticsEvent;)J

    move-result-wide v0

    const-wide/16 v2, 0x1

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->i1(Lco/bird/android/model/analytics/AnalyticsEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->v0(Lco/bird/android/model/analytics/AnalyticsEvent;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->f:Ll20;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->g1(Lco/bird/android/model/analytics/AnalyticsEvent;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Ll20;->b(Ljava/lang/String;Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method public final V1(Lco/bird/android/model/analytics/AnalyticsEvent;)V
    .locals 5

    invoke-interface {p1}, Lco/bird/android/model/analytics/AnalyticsEvent;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/16 v3, 0x2e

    invoke-static {v0, v3, v1, v2, v1}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->K:I

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->takeLast(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p1}, Lco/bird/android/model/analytics/AnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v3}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->x1(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    const-string v2, ""

    :cond_2
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->u:Llj1;

    invoke-interface {p1, v0, v1}, Llj1;->logEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final W1(Lco/bird/android/model/analytics/AnalyticsEvent;)V
    .locals 4

    invoke-interface {p1}, Lco/bird/android/model/analytics/AnalyticsEvent;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/16 v3, 0x2e

    invoke-static {v0, v3, v1, v2, v1}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->P:I

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->takeLast(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p1}, Lco/bird/android/model/analytics/AnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    const-string v2, ""

    :cond_1
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->v:Lwm1;

    invoke-interface {p1, v0, v1}, Lwm1;->logEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public c()Lio/reactivex/i;
    .locals 1

    invoke-static {p0}, Lbr4$a;->e(Lbr4;)Lio/reactivex/i;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/app/Application;Z)V
    .locals 7

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->e:Lgl;

    invoke-virtual {v0}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->w1(Lco/bird/android/model/User;)V

    :cond_0
    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->i:LLifecycleOwner;

    invoke-interface {v0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/f;->a(LFq2;)V

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    invoke-static {p2}, Lk20;->t(I)V

    goto :goto_0

    :cond_1
    const p2, 0x7fffffff

    invoke-static {p2}, Lk20;->t(I)V

    :goto_0
    new-instance p2, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$b;

    invoke-direct {p2, p0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$b;-><init>(LEa;)V

    invoke-virtual {p1, p2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    new-instance p2, LT10;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v6}, LT10;-><init>(ZZLjava/util/Set;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, p2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->E1(Landroid/content/Context;)V

    invoke-virtual {p0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->B1()V

    return-void
.end method

.method public e()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/List<",
            "Lco/bird/android/model/analytics/AnalyticsDebugEvent;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->H:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->D:J

    return-wide v0
.end method

.method public final g1(Lco/bird/android/model/analytics/AnalyticsEvent;)Ljava/util/Map;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/analytics/AnalyticsEvent;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    instance-of v0, p1, Lco/bird/android/model/analytics/BrazeableEvent;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, LL95;

    if-eqz v0, :cond_1

    check-cast p1, LL95;

    invoke-virtual {p1}, LL95;->b()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-string v0, "distance"

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    goto/16 :goto_1

    :cond_1
    instance-of v0, p1, LGL1;

    if-eqz v0, :cond_2

    goto/16 :goto_1

    :cond_2
    instance-of v0, p1, LVU4;

    if-eqz v0, :cond_3

    goto/16 :goto_1

    :cond_3
    instance-of v0, p1, LzQ4;

    if-eqz v0, :cond_4

    invoke-interface {p1}, Lco/bird/android/model/analytics/AnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object v1

    goto/16 :goto_1

    :cond_4
    instance-of v0, p1, Lm95;

    const-string v2, "ride_id"

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v0, :cond_7

    const/4 v0, 0x7

    new-array v0, v0, [Lkotlin/Pair;

    check-cast p1, Lm95;

    invoke-virtual {p1}, Lm95;->i()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_0

    :cond_5
    move v1, v7

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v8, "is_primary_ride"

    invoke-static {v8, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v6

    invoke-virtual {p1}, Lm95;->d()Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_6

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :cond_6
    const-string v6, "concurrent_ride_count"

    invoke-static {v6, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v7

    const-string v1, "area_id"

    invoke-virtual {p1}, Lm95;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v5

    const-string v1, "zone_id"

    invoke-virtual {p1}, Lm95;->g()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "partner_id"

    invoke-virtual {p1}, Lm95;->e()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v3

    invoke-virtual {p1}, Lm95;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "max_speed"

    invoke-virtual {p1}, Lm95;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v1, 0x6

    aput-object p1, v0, v1

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    goto/16 :goto_1

    :cond_7
    instance-of v0, p1, LCQ4;

    const-string v8, "reason"

    const-string v9, "last_visited_step"

    const-string v10, "end_ride_attempt_id"

    if-eqz v0, :cond_8

    new-array v0, v3, [Lkotlin/Pair;

    check-cast p1, LCQ4;

    invoke-virtual {p1}, LCQ4;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v6

    invoke-virtual {p1}, LCQ4;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v7

    invoke-virtual {p1}, LCQ4;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v5

    invoke-virtual {p1}, LCQ4;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {v8, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v0, v4

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    goto :goto_1

    :cond_8
    instance-of v0, p1, LAQ4;

    if-eqz v0, :cond_9

    new-array v0, v3, [Lkotlin/Pair;

    check-cast p1, LAQ4;

    invoke-virtual {p1}, LAQ4;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v6

    invoke-virtual {p1}, LAQ4;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v10, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v0, v7

    const-string p1, "api_call"

    invoke-static {v9, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v0, v5

    const-string p1, "api_error"

    invoke-static {v8, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v0, v4

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    goto :goto_1

    :cond_9
    instance-of v0, p1, LYP1;

    if-eqz v0, :cond_a

    new-array v0, v4, [Lkotlin/Pair;

    check-cast p1, LYP1;

    invoke-virtual {p1}, LYP1;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "document_type"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v6

    const-string v1, "entry_method"

    invoke-virtual {p1}, LYP1;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v7

    const-string v1, "selfie_entry_method"

    invoke-virtual {p1}, LYP1;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v0, v5

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    :cond_a
    :goto_1
    return-object v1
.end method

.method public final h1(Lco/bird/android/model/analytics/AnalyticsEvent;)J
    .locals 5

    instance-of v0, p1, Lco/bird/android/model/analytics/BrazeableEvent;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, LL95;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->j:LTq4;

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getBrazeConfig()Lco/bird/android/model/wire/configs/BrazeConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/BrazeConfig;->getProximityIncentive()Lco/bird/android/model/wire/configs/ThrottleSettings;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/ThrottleSettings;->getRateLimitSeconds()J

    move-result-wide v1

    goto :goto_1

    :cond_1
    instance-of v0, p1, LGL1;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    instance-of v0, p1, LVU4;

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    instance-of v0, p1, LzQ4;

    const-wide/16 v3, 0xe10

    if-eqz v0, :cond_4

    :goto_0
    move-wide v1, v3

    goto :goto_1

    :cond_4
    instance-of p1, p1, Lm95;

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    :goto_1
    return-wide v1
.end method

.method public final i1(Lco/bird/android/model/analytics/AnalyticsEvent;)Z
    .locals 4

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->v0(Lco/bird/android/model/analytics/AnalyticsEvent;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->E:Landroid/util/LruCache;

    invoke-virtual {v1, v0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/joda/time/DateTime;

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->h1(Lco/bird/android/model/analytics/AnalyticsEvent;)J

    move-result-wide v2

    long-to-int p1, v2

    invoke-virtual {v1, p1}, Lorg/joda/time/DateTime;->plusSeconds(I)Lorg/joda/time/DateTime;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->isBeforeNow()Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    :goto_0
    iget-object v1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->E:Landroid/util/LruCache;

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return p1
.end method

.method public final k1(Landroid/net/ConnectivityManager;)Ljava/lang/String;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Exception while querying network capabilities, gracefully returning null in case the issue is caused by https://issuetracker.google.com/issues/175055271"

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p1, v0, v3}, Lg46;->f(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "wifi"

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string v1, "cellular"

    :cond_1
    :goto_1
    return-object v1
.end method

.method public m()Lio/reactivex/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/v<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->g(Lbr4;)Lio/reactivex/v;

    move-result-object v0

    return-object v0
.end method

.method public o()Lio/reactivex/C;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/C<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->i(Lbr4;)Lio/reactivex/C;

    move-result-object v0

    return-object v0
.end method

.method public final o0(Lco/bird/android/model/analytics/AnalyticsEvent;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->A:La94;

    new-instance v1, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$d;

    invoke-direct {v1, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$d;-><init>(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-virtual {v0, v1}, La94;->i(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onAppBackground()V
    .locals 7
    .annotation runtime Landroidx/lifecycle/l;
        value = .enum Landroidx/lifecycle/f$a;->ON_STOP:Landroidx/lifecycle/f$a;
    .end annotation

    new-instance v6, Lbm;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lbm;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v6}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public final onAppForeground()V
    .locals 7
    .annotation runtime Landroidx/lifecycle/l;
        value = .enum Landroidx/lifecycle/f$a;->ON_START:Landroidx/lifecycle/f$a;
    .end annotation

    iget-boolean v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->C:Z

    if-nez v0, :cond_0

    new-instance v0, Lfm;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lfm;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->C:Z

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->M1()V

    return-void
.end method

.method public final q1(Ljava/util/Map;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Lorg/joda/time/DateTime;

    if-eqz v3, :cond_0

    check-cast v1, Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :cond_0
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final r1(Ljava/util/Map;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Lorg/joda/time/DateTime;

    if-eqz v3, :cond_0

    check-cast v1, Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractDateTime;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public s()Lio/reactivex/L;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/L<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lbr4$a;->k(Lbr4;)Lio/reactivex/L;

    move-result-object v0

    return-object v0
.end method

.method public final s0(Lco/bird/android/model/persistence/AnalyticsEntity;)Lio/reactivex/c;
    .locals 2

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->B:Lda;

    invoke-virtual {v0, p1}, Lda;->d(Lco/bird/android/model/persistence/AnalyticsEntity;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LOa;

    invoke-direct {v0, p0}, LOa;-><init>(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)V

    invoke-static {v0}, Lio/reactivex/F;->k(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$e;

    invoke-direct {v0, p0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$e;-><init>(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)V

    new-instance v1, LPa;

    invoke-direct {v1, v0}, LPa;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    const-string v0, "private fun batchEvent(e\u2026)\n      .schedulers()\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->H1(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final s1(Z)Ljava/lang/Integer;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object p1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->q:Landroid/telephony/TelephonyManager;

    invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getAllCellInfo()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/telephony/CellInfo;

    invoke-virtual {v2}, Landroid/telephony/CellInfo;->isRegistered()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    check-cast v1, Landroid/telephony/CellInfo;

    goto :goto_1

    :cond_3
    move-object v1, v0

    :goto_1
    instance-of p1, v1, Landroid/telephony/CellInfoWcdma;

    if-eqz p1, :cond_4

    check-cast v1, Landroid/telephony/CellInfoWcdma;

    invoke-virtual {v1}, Landroid/telephony/CellInfoWcdma;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthWcdma;

    move-result-object p1

    invoke-virtual {p1}, Landroid/telephony/CellSignalStrengthWcdma;->getLevel()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    :cond_4
    instance-of p1, v1, Landroid/telephony/CellInfoLte;

    if-eqz p1, :cond_5

    check-cast v1, Landroid/telephony/CellInfoLte;

    invoke-virtual {v1}, Landroid/telephony/CellInfoLte;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthLte;

    move-result-object p1

    invoke-virtual {p1}, Landroid/telephony/CellSignalStrengthLte;->getLevel()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    :cond_5
    instance-of p1, v1, Landroid/telephony/CellInfoGsm;

    if-eqz p1, :cond_6

    check-cast v1, Landroid/telephony/CellInfoGsm;

    invoke-virtual {v1}, Landroid/telephony/CellInfoGsm;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthGsm;

    move-result-object p1

    invoke-virtual {p1}, Landroid/telephony/CellSignalStrengthGsm;->getLevel()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    :cond_6
    instance-of p1, v1, Landroid/telephony/CellInfoCdma;

    if-eqz p1, :cond_7

    check-cast v1, Landroid/telephony/CellInfoCdma;

    invoke-virtual {v1}, Landroid/telephony/CellInfoCdma;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthCdma;

    move-result-object p1

    invoke-virtual {p1}, Landroid/telephony/CellSignalStrengthCdma;->getLevel()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_7
    :goto_2
    return-object v0
.end method

.method public final t1()Ljava/lang/Long;
    .locals 4

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v0

    const/high16 v2, 0x100000

    int-to-long v2, v2

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final u1()Ljava/lang/Double;
    .locals 5

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v1

    long-to-double v1, v1

    invoke-virtual {v0}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v3

    long-to-double v3, v3

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public v(Lco/bird/android/model/analytics/TraceKey;)Z
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->F:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/TraceKey;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ConcurrentLinkedDeque;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->peek()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf66;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public final v0(Lco/bird/android/model/analytics/AnalyticsEvent;)Ljava/lang/String;
    .locals 4

    instance-of v0, p1, Lco/bird/android/model/analytics/BrazeableEvent;

    if-eqz v0, :cond_0

    check-cast p1, Lco/bird/android/model/analytics/BrazeableEvent;

    invoke-interface {p1}, Lco/bird/android/model/analytics/BrazeableEvent;->brazeKey()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, LL95;

    if-eqz v0, :cond_1

    const-string p1, "CLIENT_DISTANCE_TO_BIRD"

    goto/16 :goto_1

    :cond_1
    instance-of v0, p1, LGL1;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, LGL1;

    invoke-virtual {v0}, LGL1;->b()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/UserRole;->RIDER:Lco/bird/android/model/constant/UserRole;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    const-string v3, "getDefault()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "RIDER_OPENED_HELP_CENTER"

    goto :goto_1

    :cond_2
    instance-of v0, p1, LVU4;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, LVU4;

    invoke-virtual {v0}, LVU4;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "alert"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "RIDE_PASS_OWNER_LOGGED_IN_ON_NEW_DEVICE"

    goto :goto_1

    :cond_3
    instance-of v0, p1, LzQ4;

    if-eqz v0, :cond_4

    const-string p1, "RIDER_ATTEMPTED_BAD_PARKING"

    goto :goto_1

    :cond_4
    instance-of v0, p1, Lm95;

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    check-cast p1, Lm95;

    invoke-virtual {p1}, Lm95;->c()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string p1, "RIDER_ENTERED_SLOW_AREA"

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Lm95;->h()Z

    move-result p1

    if-eqz p1, :cond_6

    const-string p1, "RIDER_ENTERED_NO_RIDE_AREA"

    goto :goto_1

    :cond_6
    move-object p1, v1

    goto :goto_1

    :cond_7
    instance-of v0, p1, LCQ4;

    if-nez v0, :cond_9

    instance-of v0, p1, LAQ4;

    if-eqz v0, :cond_8

    goto :goto_0

    :cond_8
    instance-of v0, p1, LYP1;

    if-eqz v0, :cond_6

    check-cast p1, LYP1;

    invoke-virtual {p1}, LYP1;->e()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/identification/IdentificationStatus;->ACCEPTED:Lco/bird/android/model/identification/IdentificationStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {p1, v0, v2}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_6

    const-string p1, "ID_SUBMISSION_RESULT_SUCCESS"

    goto :goto_1

    :cond_9
    :goto_0
    const-string p1, "RIDER_PARKING_ATTEMPT_NOT_COMPLETED"

    :goto_1
    return-object p1
.end method

.method public final v1()Ljava/lang/Integer;
    .locals 2

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->k:LuQ3;

    invoke-interface {v0}, LuQ3;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->p:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getRssi()I

    move-result v0

    const/4 v1, 0x5

    invoke-static {v0, v1}, Landroid/net/wifi/WifiManager;->calculateSignalLevel(II)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public w(Lco/bird/android/model/analytics/TraceKey;Ljava/lang/String;Ljava/util/Map;Lorg/joda/time/DateTime;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/analytics/TraceKey;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lorg/joda/time/DateTime;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "key"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "keySuffix"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->F:Ljava/util/Map;

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/analytics/TraceKey;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ConcurrentLinkedDeque;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf66;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lf66;->b()Ljava/util/Map;

    move-result-object v4

    if-nez v4, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v4

    :cond_0
    if-nez p3, :cond_1

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v5

    goto :goto_0

    :cond_1
    move-object/from16 v5, p3

    :goto_0
    invoke-static {v4, v5}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v2}, Lf66;->c()Lb66;

    move-result-object v7

    invoke-interface {v7, v6, v5}, Lb66;->b(Ljava/lang/String;Ljava/lang/String;)Lb66;

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lf66;->c()Lb66;

    move-result-object v4

    invoke-interface {v4}, Lb66;->stop()V

    if-nez p4, :cond_3

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v4

    move-object v13, v4

    goto :goto_2

    :cond_3
    move-object/from16 v13, p4

    :goto_2
    new-instance v4, LG74;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/analytics/TraceKey;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lf66;->d()Lorg/joda/time/DateTime;

    move-result-object v12

    const-string v1, "stopTime"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v5

    long-to-double v5, v5

    invoke-virtual {v2}, Lf66;->d()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v1}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v14

    long-to-double v14, v14

    sub-double v14, v5, v14

    const/16 v16, 0x7

    const/16 v17, 0x0

    move-object v6, v4

    invoke-direct/range {v6 .. v17}, LG74;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/util/Map;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;DILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v4}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Trace ended for "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public final w1(Lco/bird/android/model/User;)V
    .locals 1

    invoke-virtual {p1}, Lco/bird/android/model/User;->getId()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->v:Lwm1;

    invoke-interface {v0, p1}, Lwm1;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->w:Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    invoke-virtual {v0, p1}, Lcom/google/firebase/crashlytics/FirebaseCrashlytics;->setUserId(Ljava/lang/String;)V

    return-void
.end method

.method public x(Lco/bird/android/model/analytics/PersistentPropertyEntry;)V
    .locals 2

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->v:Lwm1;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/PersistentPropertyEntry;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/analytics/PersistentPropertyEntry;->value()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lwm1;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final x1(Ljava/lang/String;)Z
    .locals 6

    sget-object v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->R:Ljava/util/Set;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {p1, v1, v5, v3, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move v2, v5

    :cond_2
    :goto_0
    return v2
.end method

.method public y(Lco/bird/android/model/analytics/AnalyticsEvent;)V
    .locals 53
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lco/bird/android/model/analytics/AnalyticsEvent;",
            ">(TT;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "event"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->y:Ldr4;

    invoke-interface {v2}, Ldr4;->p()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/location/Location;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    iget-object v4, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->e:Lgl;

    invoke-virtual {v4}, Lgl;->s0()Lco/bird/android/model/UserRoleItem;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/UserRoleItem;->getUserRole()Lco/bird/android/model/constant/UserRole;

    move-result-object v5

    sget-object v6, Lco/bird/android/model/constant/UserRole;->OPERATOR:Lco/bird/android/model/constant/UserRole;

    if-ne v5, v6, :cond_0

    invoke-virtual {v4}, Lco/bird/android/model/UserRoleItem;->getUserRole()Lco/bird/android/model/constant/UserRole;

    move-result-object v5

    invoke-static {v5}, Lco/bird/android/model/UserRoleItemKt;->getCode(Lco/bird/android/model/constant/UserRole;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lco/bird/android/model/UserRoleItem;->getUserRoleCode()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ":"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Lco/bird/android/model/UserRoleItem;->getUserRole()Lco/bird/android/model/constant/UserRole;

    move-result-object v4

    invoke-static {v4}, Lco/bird/android/model/UserRoleItemKt;->getCode(Lco/bird/android/model/constant/UserRole;)Ljava/lang/String;

    move-result-object v4

    :goto_0
    move-object/from16 v31, v4

    iget-object v4, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->b:LOh;

    invoke-interface {v4}, LOh;->a()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    iget-object v4, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->m:Landroid/net/ConnectivityManager;

    invoke-virtual {v0, v4}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->k1(Landroid/net/ConnectivityManager;)Ljava/lang/String;

    move-result-object v8

    iget-object v4, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->h:LBc;

    invoke-interface {v4}, LBc;->d()Ljava/lang/String;

    move-result-object v10

    iget-object v4, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->h:LBc;

    invoke-interface {v4}, LBc;->getDeviceId()Ljava/lang/String;

    move-result-object v12

    iget-object v4, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->h:LBc;

    invoke-interface {v4}, LBc;->b()Ljava/lang/String;

    move-result-object v13

    iget-object v4, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->h:LBc;

    invoke-interface {v4}, LBc;->a()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v16

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v18

    invoke-virtual {v2}, Landroid/location/Location;->getSpeed()F

    move-result v4

    float-to-double v4, v4

    invoke-virtual {v2}, Landroid/location/Location;->getAltitude()D

    move-result-wide v20

    invoke-virtual {v2}, Landroid/location/Location;->getAccuracy()F

    move-result v9

    move-object/from16 v22, v12

    float-to-double v11, v9

    invoke-static {v2}, LXw2;->a(Landroid/location/Location;)Ljava/lang/Boolean;

    move-result-object v2

    iget-object v9, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->e:Lgl;

    invoke-virtual {v9}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v9

    if-eqz v9, :cond_1

    invoke-virtual {v9}, Lco/bird/android/model/User;->getId()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v23, v9

    goto :goto_1

    :cond_1
    const/16 v23, 0x0

    :goto_1
    iget-object v9, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->e:Lgl;

    invoke-virtual {v9}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v9

    if-eqz v9, :cond_2

    invoke-virtual {v9}, Lco/bird/android/model/User;->getWarehouseId()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v24, v9

    goto :goto_2

    :cond_2
    const/16 v24, 0x0

    :goto_2
    iget-object v9, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->j:LTq4;

    invoke-virtual {v9}, LTq4;->f8()LZ84;

    move-result-object v9

    invoke-virtual {v9}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v9}, Lco/bird/android/model/wire/configs/Config;->getLocalConfig()Lco/bird/android/model/wire/configs/LocalConfig;

    move-result-object v9

    if-eqz v9, :cond_3

    invoke-virtual {v9}, Lco/bird/android/model/wire/configs/LocalConfig;->getName()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v25, v9

    goto :goto_3

    :cond_3
    const/16 v25, 0x0

    :goto_3
    iget-object v9, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->g:Lde5;

    invoke-virtual {v9}, Lde5;->c()Lde5$a;

    move-result-object v9

    const-string v14, "rxBleClient.state"

    invoke-static {v9, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Lco/bird/android/model/analytics/RxBleState_Kt;->toSimpleState(Lde5$a;)Ljava/lang/String;

    move-result-object v27

    iget-object v9, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->k:LuQ3;

    sget-object v14, Lco/bird/android/model/constant/Permission;->ACCESS_FINE_LOCATION:Lco/bird/android/model/constant/Permission;

    invoke-interface {v9, v14}, LuQ3;->j(Lco/bird/android/model/constant/Permission;)Lco/bird/android/model/PermissionStatus;

    move-result-object v9

    invoke-static {v9, v14}, Lco/bird/android/model/PermissionStatusKt;->toMetadataStr(Lco/bird/android/model/PermissionStatus;Lco/bird/android/model/constant/Permission;)Ljava/lang/String;

    move-result-object v28

    iget-object v9, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->k:LuQ3;

    invoke-interface {v9}, LuQ3;->d()Z

    move-result v9

    invoke-virtual {v0, v9}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->L1(Z)Ljava/lang/String;

    move-result-object v29

    iget-object v9, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->k:LuQ3;

    sget-object v14, Lco/bird/android/model/constant/Permission;->CAMERA:Lco/bird/android/model/constant/Permission;

    invoke-interface {v9, v14}, LuQ3;->j(Lco/bird/android/model/constant/Permission;)Lco/bird/android/model/PermissionStatus;

    move-result-object v9

    invoke-static {v9, v14}, Lco/bird/android/model/PermissionStatusKt;->toMetadataStr(Lco/bird/android/model/PermissionStatus;Lco/bird/android/model/constant/Permission;)Ljava/lang/String;

    move-result-object v32

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v33

    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v34

    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v35

    iget-object v9, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->b:LOh;

    invoke-interface {v9}, LOh;->f()Ljava/lang/String;

    move-result-object v36

    invoke-virtual {v3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v3

    iget-object v9, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->b:LOh;

    invoke-interface {v9}, LOh;->e()Ljava/lang/String;

    move-result-object v37

    iget-object v9, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->j:LTq4;

    invoke-virtual {v9}, LTq4;->f8()LZ84;

    move-result-object v9

    invoke-virtual {v9}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v9}, Lco/bird/android/model/wire/configs/Config;->getHabitatStatus()Lco/bird/android/model/wire/WireHabitatStatus;

    move-result-object v9

    if-eqz v9, :cond_4

    invoke-virtual {v9}, Lco/bird/android/model/wire/WireHabitatStatus;->getContext()Lco/bird/android/model/wire/WireHabitatStatusContext;

    move-result-object v9

    if-eqz v9, :cond_4

    invoke-virtual {v9}, Lco/bird/android/model/wire/WireHabitatStatusContext;->getDerived()Lco/bird/android/model/wire/WireHabitatStatusDerivedContext;

    move-result-object v9

    if-eqz v9, :cond_4

    invoke-virtual {v9}, Lco/bird/android/model/wire/WireHabitatStatusDerivedContext;->getHabitatId()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_5

    :cond_4
    const-string v9, ""

    :cond_5
    move-object/from16 v38, v9

    iget-object v9, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->l:LGI3;

    invoke-interface {v9}, LGI3;->o1()LZ84;

    move-result-object v9

    invoke-virtual {v9}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lco/bird/android/buava/Optional;

    invoke-virtual {v9}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lco/bird/android/model/PartnerUser;

    if-eqz v9, :cond_6

    invoke-virtual {v9}, Lco/bird/android/model/PartnerUser;->getPartnerId()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v39, v9

    goto :goto_4

    :cond_6
    const/16 v39, 0x0

    :goto_4
    iget-object v9, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->k:LuQ3;

    invoke-interface {v9}, LuQ3;->o()LuQ3$a;

    move-result-object v9

    if-eqz v9, :cond_7

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v40, v9

    goto :goto_5

    :cond_7
    const/16 v40, 0x0

    :goto_5
    iget-object v9, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->e:Lgl;

    invoke-virtual {v9}, Lgl;->E0()Ljava/lang/Boolean;

    move-result-object v41

    iget-object v9, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->h:LBc;

    invoke-interface {v9}, LBc;->e()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->y1()Z

    move-result v26

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->v1()Ljava/lang/Integer;

    move-result-object v44

    iget-object v14, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->k:LuQ3;

    invoke-interface {v14}, LuQ3;->n()Z

    move-result v14

    invoke-virtual {v0, v14}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->s1(Z)Ljava/lang/Integer;

    move-result-object v45

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->u1()Ljava/lang/Double;

    move-result-object v46

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->t1()Ljava/lang/Long;

    move-result-object v47

    iget-object v14, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->j:LTq4;

    invoke-virtual {v14}, LTq4;->f8()LZ84;

    move-result-object v14

    invoke-virtual {v14}, LZ84;->a()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v14}, Lco/bird/android/model/wire/configs/Config;->getEnableMlKitBarcodeScanner()Z

    move-result v48

    new-instance v14, Lwp0;

    move-wide/from16 v42, v4

    move-object v5, v14

    const/4 v4, 0x0

    move-wide/from16 v49, v11

    move-object v11, v4

    const-string v4, "android"

    move-object v12, v14

    move-object v14, v4

    invoke-static/range {v16 .. v17}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v16

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v17

    const/16 v18, 0x0

    invoke-static/range {v42 .. v43}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v19

    invoke-static/range {v20 .. v21}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v20

    invoke-static/range {v49 .. v50}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v21

    const/16 v30, 0x0

    const-string v42, "light"

    invoke-static/range {v26 .. v26}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v43

    invoke-static/range {v48 .. v48}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v48

    const/16 v49, 0x0

    const v50, 0x1000020

    const/16 v51, 0x800

    const/16 v52, 0x0

    move-object v4, v12

    move-object/from16 v12, v22

    move-object/from16 v22, v2

    move-object/from16 v26, v27

    move-object/from16 v27, v28

    move-object/from16 v28, v29

    move-object/from16 v29, v32

    move-object/from16 v32, v33

    move-object/from16 v33, v34

    move-object/from16 v34, v35

    move-object/from16 v35, v36

    move-object/from16 v36, v3

    invoke-direct/range {v5 .. v52}, Lwp0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4}, Lwp0;->a()Ljava/util/Map;

    move-result-object v2

    sget-object v3, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->I:Lco/bird/android/manager/analytics/AnalyticsManagerImpl$c;

    invoke-static {v3, v4}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$c;->access$firebaseProperties(Lco/bird/android/manager/analytics/AnalyticsManagerImpl$c;Lwp0;)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v0, v3}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->P1(Ljava/util/Map;)V

    invoke-interface/range {p1 .. p1}, Lco/bird/android/model/analytics/AnalyticsEvent;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-interface/range {p1 .. p1}, Lco/bird/android/model/analytics/AnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object v3

    invoke-virtual/range {p0 .. p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->o0(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-virtual/range {p0 .. p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->U1(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-virtual/range {p0 .. p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->V1(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-virtual/range {p0 .. p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->W1(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-static {v3, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v2}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->q1(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    new-instance v2, Lco/bird/android/model/persistence/AnalyticsEntity;

    const/4 v5, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, Lco/bird/android/model/persistence/AnalyticsEntity;-><init>(ILjava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v3, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->j:LTq4;

    invoke-virtual {v3}, LTq4;->f8()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/Config;->getEnableOfflineAnalytics()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v0, v2}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->s0(Lco/bird/android/model/persistence/AnalyticsEntity;)Lio/reactivex/c;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/c;->subscribe()Lio/reactivex/disposables/c;

    goto :goto_7

    :cond_8
    new-instance v3, Lco/bird/api/request/CreateAnalyticsEventsBody;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v3, v2}, Lco/bird/api/request/CreateAnalyticsEventsBody;-><init>(Ljava/util/List;)V

    iget-object v2, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->t:LRh6;

    invoke-interface {v2}, LRh6;->g()Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->c:LZ9;

    invoke-interface {v2, v3}, LZ9;->b(Lco/bird/api/request/CreateAnalyticsEventsBody;)Lio/reactivex/F;

    move-result-object v2

    goto :goto_6

    :cond_9
    iget-object v2, v0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->d:Lab;

    invoke-interface {v2, v3}, Lab;->a(Lco/bird/api/request/CreateAnalyticsEventsBody;)Lio/reactivex/F;

    move-result-object v2

    :goto_6
    new-instance v3, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$m;

    invoke-direct {v3, v1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$m;-><init>(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    new-instance v1, LFa;

    invoke-direct {v1, v3}, LFa;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v1}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/c;->subscribe()Lio/reactivex/disposables/c;

    :goto_7
    return-void
.end method

.method public final y1()Z
    .locals 3

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->o:Landroid/app/admin/DevicePolicyManager;

    invoke-virtual {v0}, Landroid/app/admin/DevicePolicyManager;->getActiveAdmins()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ComponentName;

    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "admin.packageName"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->o:Landroid/app/admin/DevicePolicyManager;

    invoke-virtual {v2, v1}, Landroid/app/admin/DevicePolicyManager;->isProfileOwnerApp(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->o:Landroid/app/admin/DevicePolicyManager;

    invoke-virtual {v2, v1}, Landroid/app/admin/DevicePolicyManager;->isDeviceOwnerApp(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public z(Lco/bird/android/model/analytics/TraceKey;Ljava/util/Map;Lorg/joda/time/DateTime;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/analytics/TraceKey;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lorg/joda/time/DateTime;",
            ")V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->F:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/TraceKey;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->F:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/TraceKey;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    new-instance v0, Lf66;

    if-nez p3, :cond_1

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object p3

    :cond_1
    const-string v1, "startTimeOverride ?: DateTime.now()"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->s:Li66;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/TraceKey;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Li66;->a(Ljava/lang/String;)Lb66;

    move-result-object v1

    invoke-direct {v0, p3, v1, p2}, Lf66;-><init>(Lorg/joda/time/DateTime;Lb66;Ljava/util/Map;)V

    iget-object p2, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->F:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/TraceKey;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ConcurrentLinkedDeque;

    if-eqz p1, :cond_2

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->push(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v0}, Lf66;->c()Lb66;

    move-result-object p1

    invoke-interface {p1}, Lb66;->start()Lb66;

    return-void
.end method

.method public final z1()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->n:Lo21;

    invoke-interface {v0}, Lo21;->c()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string v2, "UNBOUND"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$f;

    invoke-direct {v1, p0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$f;-><init>(Ljava/lang/Object;)V

    new-instance v2, LQa;

    invoke-direct {v2, v1}, LQa;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
