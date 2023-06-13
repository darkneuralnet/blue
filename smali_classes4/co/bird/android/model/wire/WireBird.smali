.class public final Lco/bird/android/model/wire/WireBird;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/wire/WireBird$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a5\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\u0008\u00ad\u0001\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u0000 \u0086\u00022\u00020\u0001:\u0002\u0086\u0002B\u00e1\u0005\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001a\u0012\u000e\u0008\u0002\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010 \u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010!\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\"\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010#\u001a\u00020$\u0012\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010&\u001a\u00020\'\u0012\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010,\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010-\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010)\u0012\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010)\u0012\u0008\u0008\u0002\u00100\u001a\u00020\u0010\u0012\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u00103\u001a\u0004\u0018\u000104\u0012\u0008\u0008\u0002\u00105\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u00106\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u00107\u001a\u00020\u0010\u0012\n\u0008\u0002\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u00109\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010:\u001a\u0004\u0018\u00010)\u0012\n\u0008\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\u0008\u0008\u0002\u0010=\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010>\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010?\u001a\u00020@\u0012\u0008\u0008\u0002\u0010A\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010B\u001a\u0004\u0018\u00010C\u0012\n\u0008\u0002\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010F\u001a\u0004\u0018\u00010G\u0012\n\u0008\u0002\u0010H\u001a\u0004\u0018\u00010I\u0012\n\u0008\u0002\u0010J\u001a\u0004\u0018\u00010)\u0012\u0008\u0008\u0002\u0010K\u001a\u00020L\u0012\u000e\u0008\u0002\u0010M\u001a\u0008\u0012\u0004\u0012\u00020N0\u001c\u0012\u0008\u0008\u0002\u0010O\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010P\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010Q\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010R\u001a\u0004\u0018\u00010)\u0012\n\u0008\u0002\u0010S\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010T\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010U\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010VJ\n\u0010\u00b5\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b6\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b7\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00b8\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00b9\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00ba\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00bb\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00bc\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00bd\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00be\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00bf\u0001\u001a\u00020\u0010H\u00c6\u0003J\u000c\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00c1\u0001\u001a\u00020\u001aH\u00c6\u0003J\u0010\u0010\u00c2\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001cH\u00c6\u0003J\u000c\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010lJ\n\u0010\u00c5\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c6\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00c7\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00c8\u0001\u001a\u00020$H\u00c6\u0003J\u000c\u0010\u00c9\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00ca\u0001\u001a\u00020\'H\u00c6\u0003J\u000c\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00cc\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\u000c\u0010\u00cd\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\u000c\u0010\u00ce\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00cf\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00d0\u0001\u001a\u00020\u0010H\u00c6\u0003J\u000c\u0010\u00d1\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\u000c\u0010\u00d2\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\n\u0010\u00d3\u0001\u001a\u00020\u0010H\u00c6\u0003J\u000c\u0010\u00d4\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00d5\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00d6\u0001\u001a\u00020\u0007H\u00c6\u0003J\u000c\u0010\u00d7\u0001\u001a\u0004\u0018\u000104H\u00c6\u0003J\n\u0010\u00d8\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00d9\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00da\u0001\u001a\u00020\u0010H\u00c6\u0003J\u000c\u0010\u00db\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00dd\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\u000c\u0010\u00de\u0001\u001a\u0004\u0018\u00010<H\u00c6\u0003J\n\u0010\u00df\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00e0\u0001\u001a\u00020\u0010H\u00c6\u0003J\u0011\u0010\u00e1\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010lJ\n\u0010\u00e2\u0001\u001a\u00020@H\u00c6\u0003J\n\u0010\u00e3\u0001\u001a\u00020\u0010H\u00c6\u0003J\u000c\u0010\u00e4\u0001\u001a\u0004\u0018\u00010CH\u00c6\u0003J\u000c\u0010\u00e5\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00e6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00e7\u0001\u001a\u0004\u0018\u00010GH\u00c6\u0003J\u000c\u0010\u00e8\u0001\u001a\u0004\u0018\u00010IH\u00c6\u0003J\u000c\u0010\u00e9\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\n\u0010\u00ea\u0001\u001a\u00020LH\u00c6\u0003J\u0010\u0010\u00eb\u0001\u001a\u0008\u0012\u0004\u0012\u00020N0\u001cH\u00c6\u0003J\n\u0010\u00ec\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00ed\u0001\u001a\u00020\u0010H\u00c6\u0003J\u000c\u0010\u00ee\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00ef\u0001\u001a\u00020\u0010H\u00c6\u0003J\u000c\u0010\u00f0\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\u000c\u0010\u00f1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00f2\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00f3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00f4\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u00f5\u0001\u001a\u00020\u0003H\u00c6\u0003J\u000c\u0010\u00f6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00ec\u0005\u0010\u00f7\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001a2\u000e\u0008\u0002\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010 \u001a\u00020\u00032\u0008\u0008\u0002\u0010!\u001a\u00020\u00102\u0008\u0008\u0002\u0010\"\u001a\u00020\u00102\u0008\u0008\u0002\u0010#\u001a\u00020$2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010&\u001a\u00020\'2\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010,\u001a\u00020\u00102\u0008\u0008\u0002\u0010-\u001a\u00020\u00102\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010)2\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010)2\u0008\u0008\u0002\u00100\u001a\u00020\u00102\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u00103\u001a\u0004\u0018\u0001042\u0008\u0008\u0002\u00105\u001a\u00020\u00102\u0008\u0008\u0002\u00106\u001a\u00020\u00102\u0008\u0008\u0002\u00107\u001a\u00020\u00102\n\u0008\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010:\u001a\u0004\u0018\u00010)2\n\u0008\u0002\u0010;\u001a\u0004\u0018\u00010<2\u0008\u0008\u0002\u0010=\u001a\u00020\u00102\u0008\u0008\u0002\u0010>\u001a\u00020\u00102\u0008\u0008\u0002\u0010?\u001a\u00020@2\u0008\u0008\u0002\u0010A\u001a\u00020\u00102\n\u0008\u0002\u0010B\u001a\u0004\u0018\u00010C2\n\u0008\u0002\u0010D\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010E\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010F\u001a\u0004\u0018\u00010G2\n\u0008\u0002\u0010H\u001a\u0004\u0018\u00010I2\n\u0008\u0002\u0010J\u001a\u0004\u0018\u00010)2\u0008\u0008\u0002\u0010K\u001a\u00020L2\u000e\u0008\u0002\u0010M\u001a\u0008\u0012\u0004\u0012\u00020N0\u001c2\u0008\u0008\u0002\u0010O\u001a\u00020\u00102\n\u0008\u0002\u0010P\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010Q\u001a\u00020\u00102\n\u0008\u0002\u0010R\u001a\u0004\u0018\u00010)2\n\u0008\u0002\u0010S\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010T\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00f8\u0001J\n\u0010\u00f9\u0001\u001a\u00020\u0007H\u00d6\u0001J\u0016\u0010\u00fa\u0001\u001a\u00020\u00102\n\u0010\u00fb\u0001\u001a\u0005\u0018\u00010\u00fc\u0001H\u00d6\u0003J\n\u0010\u00fd\u0001\u001a\u00020\u0007H\u00d6\u0001J\u0010\u0010\u00fe\u0001\u001a\u00020\u00102\u0007\u0010\u00fb\u0001\u001a\u00020\u0000J\u0010\u0010\u00ff\u0001\u001a\u00020\u00102\u0007\u0010\u00fb\u0001\u001a\u00020\u0000J\t\u0010\u0080\u0002\u001a\u00020\u0003H\u0016J\u001e\u0010\u0081\u0002\u001a\u00030\u0082\u00022\u0008\u0010\u0083\u0002\u001a\u00030\u0084\u00022\u0007\u0010\u0085\u0002\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008W\u0010XR\u001c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Y\u0010ZR\u0018\u0010D\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008[\u0010\\R\u0016\u00100\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008]\u0010XR\u0016\u0010K\u001a\u00020L8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008^\u0010_R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008`\u0010aR\u0018\u0010S\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008b\u0010\\R\u0016\u0010,\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008c\u0010XR\u0018\u00102\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008d\u0010\\R\u0016\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008e\u0010\\R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008f\u0010\\R\u0016\u0010#\u001a\u00020$8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008g\u0010hR\u0016\u0010!\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008i\u0010XR\u0016\u0010\"\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008j\u0010XR\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010m\u001a\u0004\u0008k\u0010lR\u001c\u0010M\u001a\u0008\u0012\u0004\u0012\u00020N0\u001c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008n\u0010ZR\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008o\u0010\\R\u0016\u0010\u0018\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008p\u0010XR\u0016\u0010\u0016\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008q\u0010XR\u0018\u0010T\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008r\u0010\\R\u0016\u0010-\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008s\u0010XR\u0016\u0010\u000c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008t\u0010\\R\u0016\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008u\u0010XR\u0016\u0010>\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008v\u0010XR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008w\u0010XR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008x\u0010aR\u0016\u00106\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008y\u0010XR\u0018\u0010/\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008z\u0010{R\u0018\u0010P\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008|\u0010\\R\u001a\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010m\u001a\u0004\u0008}\u0010lR\u0013\u0010U\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008~\u0010\\R\u0018\u0010E\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u007f\u0010\\R\u0019\u0010(\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0080\u0001\u0010{R\u0017\u0010\u0017\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0081\u0001\u0010XR\u0017\u0010Q\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0082\u0001\u0010XR\u0017\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0083\u0001\u0010\\R\u0019\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0084\u0001\u0010\\R\u0011\u0010O\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008O\u0010XR\u0018\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u0085\u0001\u0010\u0086\u0001R\u0019\u0010:\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0087\u0001\u0010{R\u001a\u0010B\u001a\u0004\u0018\u00010C8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u0088\u0001\u0010\u0089\u0001R\u0018\u0010?\u001a\u00020@8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u008c\u0001\u0010\u008d\u0001R\u0019\u0010R\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u008e\u0001\u0010{R\u0017\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u008f\u0001\u0010XR\u0017\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0090\u0001\u0010XR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0091\u0001\u0010\\R-\u0010\u0092\u0001\u001a\u0008\u0012\u0004\u0012\u0002040\u001c8FX\u0086\u0084\u0002\u00a2\u0006\u0017\n\u0006\u0008\u0096\u0001\u0010\u0097\u0001\u0012\u0006\u0008\u0093\u0001\u0010\u0094\u0001\u001a\u0005\u0008\u0095\u0001\u0010ZR\u0017\u00107\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0098\u0001\u0010XR\u0019\u00109\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0099\u0001\u0010\\R\u001a\u0010F\u001a\u0004\u0018\u00010G8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u009a\u0001\u0010\u009b\u0001R\u0017\u0010A\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u009c\u0001\u0010XR\u001a\u0010;\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u009d\u0001\u0010\u009e\u0001R\u0019\u00108\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u009f\u0001\u0010\\R\u0017\u0010=\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a0\u0001\u0010XR\"\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0000\u0012\u0006\u0008\u00a1\u0001\u0010\u0094\u0001\u001a\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001R/\u0010\u00a4\u0001\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u001c8FX\u0086\u0084\u0002\u00a2\u0006\u0017\n\u0006\u0008\u00a7\u0001\u0010\u0097\u0001\u0012\u0006\u0008\u00a5\u0001\u0010\u0094\u0001\u001a\u0005\u0008\u00a6\u0001\u0010ZR\u0017\u00105\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a8\u0001\u0010XR\u001a\u0010H\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001R\u0019\u0010J\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00ab\u0001\u0010{R\u0017\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00ac\u0001\u0010\\R\u0019\u0010.\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00ad\u0001\u0010{R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00ae\u0001\u0010\\R\u0017\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00af\u0001\u0010XR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b0\u0001\u0010\\R\u0018\u0010&\u001a\u00020\'8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u00b1\u0001\u0010\u00b2\u0001R\u0019\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b3\u0001\u0010\\R\u0019\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b4\u0001\u0010{\u00a8\u0006\u0087\u0002\u00b2\u0006\u000b\u0010\u0088\u0002\u001a\u00020\u0010X\u008a\u0084\u0002\u00b2\u0006\u000b\u0010\u0089\u0002\u001a\u00020\u0010X\u008a\u0084\u0002\u00b2\u0006\u000b\u0010\u008a\u0002\u001a\u00020\u0010X\u008a\u0084\u0002\u00b2\u0006\u000b\u0010\u008b\u0002\u001a\u00020\u0010X\u008a\u0084\u0002"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBird;",
        "Landroid/os/Parcelable;",
        "id",
        "",
        "model",
        "taskId",
        "batteryLevel",
        "",
        "estimatedRange",
        "distance",
        "location",
        "Lco/bird/android/model/wire/WireLocation;",
        "code",
        "stickerId",
        "serialNumber",
        "disconnected",
        "",
        "collect",
        "submerged",
        "lost",
        "locked",
        "ackLocked",
        "captive",
        "gpsFix",
        "broken",
        "label",
        "Lco/bird/android/model/wire/WireBirdLabel;",
        "actions",
        "",
        "Lco/bird/android/model/constant/BirdAction;",
        "bountyId",
        "bountyPrice",
        "bountyCurrency",
        "bountyLost",
        "bountyOverdue",
        "bountyKind",
        "Lco/bird/android/model/constant/BountyKind;",
        "brandName",
        "taskKind",
        "Lco/bird/android/model/constant/BirdTaskKind;",
        "gpsAt",
        "Lorg/joda/time/DateTime;",
        "trackedAt",
        "token",
        "bluetooth",
        "cellular",
        "startedAt",
        "dueAt",
        "asleep",
        "imei",
        "boardProtocol",
        "physicalLock",
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        "priorityCollect",
        "down",
        "needsInspection",
        "partnerId",
        "nestId",
        "lastRideEndedAt",
        "partnerBirdState",
        "Lco/bird/android/model/constant/PartnerBirdState;",
        "peril",
        "deliverable",
        "lifecycle",
        "Lco/bird/android/model/wire/WireLifecycle;",
        "offline",
        "license",
        "Lco/bird/android/model/wire/WireBirdLicenseView;",
        "areaKey",
        "fleetId",
        "nestPurpose",
        "Lco/bird/android/model/constant/NestPurpose;",
        "privateBird",
        "Lco/bird/android/model/wire/WirePrivateBird;",
        "scannedAt",
        "badgeType",
        "Lco/bird/android/model/constant/MapPinBadge;",
        "bountyReasons",
        "Lco/bird/android/model/wire/WireBountyReason;",
        "isScanlessRideEligible",
        "ephemeralId",
        "hasHelmet",
        "locationUpdatedAt",
        "bleMacAddress",
        "cellId",
        "externalFeedType",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getAckLocked",
        "()Z",
        "getActions",
        "()Ljava/util/List;",
        "getAreaKey",
        "()Ljava/lang/String;",
        "getAsleep",
        "getBadgeType",
        "()Lco/bird/android/model/constant/MapPinBadge;",
        "getBatteryLevel",
        "()I",
        "getBleMacAddress",
        "getBluetooth",
        "getBoardProtocol",
        "getBountyCurrency",
        "getBountyId",
        "getBountyKind",
        "()Lco/bird/android/model/constant/BountyKind;",
        "getBountyLost",
        "getBountyOverdue",
        "getBountyPrice",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getBountyReasons",
        "getBrandName",
        "getBroken",
        "getCaptive",
        "getCellId",
        "getCellular",
        "getCode",
        "getCollect",
        "getDeliverable",
        "getDisconnected",
        "getDistance",
        "getDown",
        "getDueAt",
        "()Lorg/joda/time/DateTime;",
        "getEphemeralId",
        "getEstimatedRange",
        "getExternalFeedType",
        "getFleetId",
        "getGpsAt",
        "getGpsFix",
        "getHasHelmet",
        "getId",
        "getImei",
        "getLabel",
        "()Lco/bird/android/model/wire/WireBirdLabel;",
        "getLastRideEndedAt",
        "getLicense",
        "()Lco/bird/android/model/wire/WireBirdLicenseView;",
        "getLifecycle",
        "()Lco/bird/android/model/wire/WireLifecycle;",
        "getLocation",
        "()Lco/bird/android/model/wire/WireLocation;",
        "getLocationUpdatedAt",
        "getLocked",
        "getLost",
        "getModel",
        "modelSpecificPhysicalLocks",
        "getModelSpecificPhysicalLocks$annotations",
        "()V",
        "getModelSpecificPhysicalLocks",
        "modelSpecificPhysicalLocks$delegate",
        "Lkotlin/Lazy;",
        "getNeedsInspection",
        "getNestId",
        "getNestPurpose",
        "()Lco/bird/android/model/constant/NestPurpose;",
        "getOffline",
        "getPartnerBirdState",
        "()Lco/bird/android/model/constant/PartnerBirdState;",
        "getPartnerId",
        "getPeril",
        "getPhysicalLock$annotations",
        "getPhysicalLock",
        "()Lco/bird/android/model/wire/WirePhysicalLock;",
        "physicalLocks",
        "getPhysicalLocks$annotations",
        "getPhysicalLocks",
        "physicalLocks$delegate",
        "getPriorityCollect",
        "getPrivateBird",
        "()Lco/bird/android/model/wire/WirePrivateBird;",
        "getScannedAt",
        "getSerialNumber",
        "getStartedAt",
        "getStickerId",
        "getSubmerged",
        "getTaskId",
        "getTaskKind",
        "()Lco/bird/android/model/constant/BirdTaskKind;",
        "getToken",
        "getTrackedAt",
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
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireBird;",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "isProbablySame",
        "isSame",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "Companion",
        "model-wire_release",
        "idMatches",
        "codeMatches",
        "serialMatches",
        "imeiMatches"
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
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lco/bird/android/model/wire/WireBird$Companion;

.field private static final DEFAULT_DUE_TIME_HOUR:Ljava/lang/String;

.field public static final ZIG_ZAG_EXTERNAL_FEED_TYPE:Ljava/lang/String; = "zigzag"


# instance fields
.field private final ackLocked:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ack_locked"
    .end annotation

    .annotation runtime Lft5;
        value = "ack_locked"
    .end annotation
.end field

.field private final actions:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "actions"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/BirdAction;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "actions"
    .end annotation
.end field

.field private final areaKey:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "area_key"
    .end annotation

    .annotation runtime Lft5;
        value = "area_key"
    .end annotation
.end field

.field private final asleep:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "asleep"
    .end annotation

    .annotation runtime Lft5;
        value = "asleep"
    .end annotation
.end field

.field private final badgeType:Lco/bird/android/model/constant/MapPinBadge;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "badge_type"
    .end annotation

    .annotation runtime Lft5;
        value = "badge_type"
    .end annotation
.end field

.field private final batteryLevel:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "battery_level"
    .end annotation

    .annotation runtime Lft5;
        value = "battery_level"
    .end annotation
.end field

.field private final bleMacAddress:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ble_mac_address"
    .end annotation

    .annotation runtime Lft5;
        value = "ble_mac_address"
    .end annotation
.end field

.field private final bluetooth:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bluetooth"
    .end annotation

    .annotation runtime Lft5;
        value = "bluetooth"
    .end annotation
.end field

.field private final boardProtocol:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "board_protocol"
    .end annotation

    .annotation runtime Lft5;
        value = "board_protocol"
    .end annotation
.end field

.field private final bountyCurrency:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bounty_currency"
    .end annotation

    .annotation runtime Lft5;
        value = "bounty_currency"
    .end annotation
.end field

.field private final bountyId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bounty_id"
    .end annotation

    .annotation runtime Lft5;
        value = "bounty_id"
    .end annotation
.end field

.field private final bountyKind:Lco/bird/android/model/constant/BountyKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bounty_kind"
    .end annotation

    .annotation runtime Lft5;
        value = "bounty_kind"
    .end annotation
.end field

.field private final bountyLost:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bounty_lost"
    .end annotation

    .annotation runtime Lft5;
        value = "bounty_lost"
    .end annotation
.end field

.field private final bountyOverdue:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bounty_overdue"
    .end annotation

    .annotation runtime Lft5;
        value = "bounty_overdue"
    .end annotation
.end field

.field private final bountyPrice:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bounty_price"
    .end annotation

    .annotation runtime Lft5;
        value = "bounty_price"
    .end annotation
.end field

.field private final bountyReasons:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bounty_reasons"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBountyReason;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "bounty_reasons"
    .end annotation
.end field

.field private final brandName:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "brand_name"
    .end annotation

    .annotation runtime Lft5;
        value = "brand_name"
    .end annotation
.end field

.field private final broken:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "broken"
    .end annotation

    .annotation runtime Lft5;
        value = "broken"
    .end annotation
.end field

.field private final captive:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "captive"
    .end annotation

    .annotation runtime Lft5;
        value = "captive"
    .end annotation
.end field

.field private final cellId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "cell_id"
    .end annotation

    .annotation runtime Lft5;
        value = "cell_id"
    .end annotation
.end field

.field private final cellular:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "cellular"
    .end annotation

    .annotation runtime Lft5;
        value = "cellular"
    .end annotation
.end field

.field private final code:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "code"
    .end annotation

    .annotation runtime Lft5;
        value = "code"
    .end annotation
.end field

.field private final collect:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "accident"
    .end annotation

    .annotation runtime Lft5;
        value = "accident"
    .end annotation
.end field

.field private final deliverable:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "deliverable"
    .end annotation

    .annotation runtime Lft5;
        value = "deliverable"
    .end annotation
.end field

.field private final disconnected:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "disconnected"
    .end annotation

    .annotation runtime Lft5;
        value = "disconnected"
    .end annotation
.end field

.field private final distance:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "distance"
    .end annotation

    .annotation runtime Lft5;
        value = "distance"
    .end annotation
.end field

.field private final down:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "down"
    .end annotation

    .annotation runtime Lft5;
        value = "down"
    .end annotation
.end field

.field private final dueAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "due_at"
    .end annotation

    .annotation runtime Lft5;
        value = "due_at"
    .end annotation
.end field

.field private final ephemeralId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ephemeral_id"
    .end annotation

    .annotation runtime Lft5;
        value = "ephemeral_id"
    .end annotation
.end field

.field private final estimatedRange:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "estimated_range"
    .end annotation

    .annotation runtime Lft5;
        value = "estimated_range"
    .end annotation
.end field

.field private final externalFeedType:Ljava/lang/String;

.field private final fleetId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "fleet_id"
    .end annotation

    .annotation runtime Lft5;
        value = "fleet_id"
    .end annotation
.end field

.field private final gpsAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "gps_at"
    .end annotation

    .annotation runtime Lft5;
        value = "gps_at"
    .end annotation
.end field

.field private final gpsFix:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "gps_fix"
    .end annotation

    .annotation runtime Lft5;
        value = "gps_fix"
    .end annotation
.end field

.field private final hasHelmet:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "has_helmet"
    .end annotation

    .annotation runtime Lft5;
        value = "has_helmet"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "id"
    .end annotation

    .annotation runtime Lft5;
        value = "id"
    .end annotation
.end field

.field private final imei:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "imei"
    .end annotation

    .annotation runtime Lft5;
        value = "imei"
    .end annotation
.end field

.field private final isScanlessRideEligible:Z

.field private final label:Lco/bird/android/model/wire/WireBirdLabel;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "label"
    .end annotation

    .annotation runtime Lft5;
        value = "label"
    .end annotation
.end field

.field private final lastRideEndedAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "last_ride_ended_at"
    .end annotation

    .annotation runtime Lft5;
        value = "last_ride_ended_at"
    .end annotation
.end field

.field private final license:Lco/bird/android/model/wire/WireBirdLicenseView;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "license"
    .end annotation

    .annotation runtime Lft5;
        value = "license"
    .end annotation
.end field

.field private final lifecycle:Lco/bird/android/model/wire/WireLifecycle;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "lifecycle"
    .end annotation

    .annotation runtime Lft5;
        value = "lifecycle"
    .end annotation
.end field

.field private final location:Lco/bird/android/model/wire/WireLocation;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "location"
    .end annotation

    .annotation runtime Lft5;
        value = "location"
    .end annotation
.end field

.field private final locationUpdatedAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "location_updated_at"
    .end annotation

    .annotation runtime Lft5;
        value = "location_updated_at"
    .end annotation
.end field

.field private final locked:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "locked"
    .end annotation

    .annotation runtime Lft5;
        value = "locked"
    .end annotation
.end field

.field private final lost:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "lost"
    .end annotation

    .annotation runtime Lft5;
        value = "lost"
    .end annotation
.end field

.field private final model:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "model"
    .end annotation

    .annotation runtime Lft5;
        value = "model"
    .end annotation
.end field

.field private final transient modelSpecificPhysicalLocks$delegate:Lkotlin/Lazy;

.field private final needsInspection:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "needs_inspection"
    .end annotation

    .annotation runtime Lft5;
        value = "needs_inspection"
    .end annotation
.end field

.field private final nestId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "nest_id"
    .end annotation

    .annotation runtime Lft5;
        value = "nest_id"
    .end annotation
.end field

.field private final nestPurpose:Lco/bird/android/model/constant/NestPurpose;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "nest_purpose"
    .end annotation

    .annotation runtime Lft5;
        value = "nest_purpose"
    .end annotation
.end field

.field private final offline:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "offline"
    .end annotation

    .annotation runtime Lft5;
        value = "offline"
    .end annotation
.end field

.field private final partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "partner_bird_state"
    .end annotation

    .annotation runtime Lft5;
        value = "partner_bird_state"
    .end annotation
.end field

.field private final partnerId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "partner_id"
    .end annotation

    .annotation runtime Lft5;
        value = "partner_id"
    .end annotation
.end field

.field private final peril:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "peril"
    .end annotation

    .annotation runtime Lft5;
        value = "peril"
    .end annotation
.end field

.field private final physicalLock:Lco/bird/android/model/wire/WirePhysicalLock;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "physical_lock"
    .end annotation

    .annotation runtime Lft5;
        value = "physical_lock"
    .end annotation
.end field

.field private final transient physicalLocks$delegate:Lkotlin/Lazy;

.field private final priorityCollect:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "priority_collect"
    .end annotation

    .annotation runtime Lft5;
        value = "priority_collect"
    .end annotation
.end field

.field private final privateBird:Lco/bird/android/model/wire/WirePrivateBird;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "private_bird"
    .end annotation

    .annotation runtime Lft5;
        value = "private_bird"
    .end annotation
.end field

.field private final scannedAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "scanned_at"
    .end annotation

    .annotation runtime Lft5;
        value = "scanned_at"
    .end annotation
.end field

.field private final serialNumber:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "serial_number"
    .end annotation

    .annotation runtime Lft5;
        value = "serial_number"
    .end annotation
.end field

.field private final startedAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "started_at"
    .end annotation

    .annotation runtime Lft5;
        value = "started_at"
    .end annotation
.end field

.field private final stickerId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "sticker_id"
    .end annotation

    .annotation runtime Lft5;
        value = "sticker_id"
    .end annotation
.end field

.field private final submerged:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "submerged"
    .end annotation

    .annotation runtime Lft5;
        value = "submerged"
    .end annotation
.end field

.field private final taskId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "task_id"
    .end annotation

    .annotation runtime Lft5;
        value = "task_id"
    .end annotation
.end field

.field private final taskKind:Lco/bird/android/model/constant/BirdTaskKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "task_kind"
    .end annotation

    .annotation runtime Lft5;
        value = "task_kind"
    .end annotation
.end field

.field private final token:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "token"
    .end annotation

    .annotation runtime Lft5;
        value = "token"
    .end annotation
.end field

.field private final trackedAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "tracked_at"
    .end annotation

    .annotation runtime Lft5;
        value = "tracked_at"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lco/bird/android/model/wire/WireBird$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/wire/WireBird$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/wire/WireBird;->Companion:Lco/bird/android/model/wire/WireBird$Companion;

    new-instance v0, Lco/bird/android/model/wire/WireBird$Creator;

    invoke-direct {v0}, Lco/bird/android/model/wire/WireBird$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/wire/WireBird;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v0, "-S"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forStyle(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    new-instance v1, Lorg/joda/time/LocalTime;

    const/4 v2, 0x7

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lorg/joda/time/LocalTime;-><init>(II)V

    invoke-virtual {v0, v1}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadablePartial;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "forStyle(\"-S\").print(LocalTime(7, 0))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lco/bird/android/model/wire/WireBird;->DEFAULT_DUE_TIME_HOUR:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 71

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

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

    const/16 v67, -0x1

    const/16 v68, -0x1

    const/16 v69, 0x3

    const/16 v70, 0x0

    invoke-direct/range {v0 .. v70}, Lco/bird/android/model/wire/WireBird;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Integer;",
            "I",
            "Lco/bird/android/model/wire/WireLocation;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZZZZZZZ",
            "Lco/bird/android/model/wire/WireBirdLabel;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/BirdAction;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "ZZ",
            "Lco/bird/android/model/constant/BountyKind;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/BirdTaskKind;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/lang/String;",
            "ZZ",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            "ZZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            "Lco/bird/android/model/constant/PartnerBirdState;",
            "ZZ",
            "Lco/bird/android/model/wire/WireLifecycle;",
            "Z",
            "Lco/bird/android/model/wire/WireBirdLicenseView;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/NestPurpose;",
            "Lco/bird/android/model/wire/WirePrivateBird;",
            "Lorg/joda/time/DateTime;",
            "Lco/bird/android/model/constant/MapPinBadge;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBountyReason;",
            ">;Z",
            "Ljava/lang/String;",
            "Z",
            "Lorg/joda/time/DateTime;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p7

    move-object/from16 v3, p8

    move-object/from16 v4, p10

    move-object/from16 v5, p20

    move-object/from16 v6, p21

    move-object/from16 v7, p24

    move-object/from16 v8, p27

    move-object/from16 v9, p29

    move-object/from16 v10, p50

    move-object/from16 v11, p58

    move-object/from16 v12, p59

    const-string v13, "id"

    invoke-static {p1, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "location"

    invoke-static {v2, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "code"

    invoke-static {v3, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "serialNumber"

    invoke-static {v4, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "label"

    invoke-static {v5, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "actions"

    invoke-static {v6, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "bountyCurrency"

    invoke-static {v7, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "bountyKind"

    invoke-static {v8, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "taskKind"

    invoke-static {v9, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "lifecycle"

    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "badgeType"

    invoke-static {v11, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "bountyReasons"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->id:Ljava/lang/String;

    move-object/from16 v1, p2

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->model:Ljava/lang/String;

    move-object/from16 v1, p3

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->taskId:Ljava/lang/String;

    move/from16 v1, p4

    iput v1, v0, Lco/bird/android/model/wire/WireBird;->batteryLevel:I

    move-object/from16 v1, p5

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->estimatedRange:Ljava/lang/Integer;

    move/from16 v1, p6

    iput v1, v0, Lco/bird/android/model/wire/WireBird;->distance:I

    iput-object v2, v0, Lco/bird/android/model/wire/WireBird;->location:Lco/bird/android/model/wire/WireLocation;

    iput-object v3, v0, Lco/bird/android/model/wire/WireBird;->code:Ljava/lang/String;

    move-object/from16 v1, p9

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->stickerId:Ljava/lang/String;

    iput-object v4, v0, Lco/bird/android/model/wire/WireBird;->serialNumber:Ljava/lang/String;

    move/from16 v1, p11

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->disconnected:Z

    move/from16 v1, p12

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->collect:Z

    move/from16 v1, p13

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->submerged:Z

    move/from16 v1, p14

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->lost:Z

    move/from16 v1, p15

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->locked:Z

    move/from16 v1, p16

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->ackLocked:Z

    move/from16 v1, p17

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->captive:Z

    move/from16 v1, p18

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->gpsFix:Z

    move/from16 v1, p19

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->broken:Z

    iput-object v5, v0, Lco/bird/android/model/wire/WireBird;->label:Lco/bird/android/model/wire/WireBirdLabel;

    iput-object v6, v0, Lco/bird/android/model/wire/WireBird;->actions:Ljava/util/List;

    move-object/from16 v1, p22

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->bountyId:Ljava/lang/String;

    move-object/from16 v1, p23

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->bountyPrice:Ljava/lang/Integer;

    iput-object v7, v0, Lco/bird/android/model/wire/WireBird;->bountyCurrency:Ljava/lang/String;

    move/from16 v1, p25

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->bountyLost:Z

    move/from16 v1, p26

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->bountyOverdue:Z

    iput-object v8, v0, Lco/bird/android/model/wire/WireBird;->bountyKind:Lco/bird/android/model/constant/BountyKind;

    move-object/from16 v1, p28

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->brandName:Ljava/lang/String;

    iput-object v9, v0, Lco/bird/android/model/wire/WireBird;->taskKind:Lco/bird/android/model/constant/BirdTaskKind;

    move-object/from16 v1, p30

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->gpsAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p31

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->trackedAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p32

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->token:Ljava/lang/String;

    move/from16 v1, p33

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->bluetooth:Z

    move/from16 v1, p34

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->cellular:Z

    move-object/from16 v1, p35

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->startedAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p36

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->dueAt:Lorg/joda/time/DateTime;

    move/from16 v1, p37

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->asleep:Z

    move-object/from16 v1, p38

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->imei:Ljava/lang/String;

    move-object/from16 v1, p39

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->boardProtocol:Ljava/lang/String;

    move-object/from16 v1, p40

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->physicalLock:Lco/bird/android/model/wire/WirePhysicalLock;

    move/from16 v1, p41

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->priorityCollect:Z

    move/from16 v1, p42

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->down:Z

    move/from16 v1, p43

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->needsInspection:Z

    move-object/from16 v1, p44

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->partnerId:Ljava/lang/String;

    move-object/from16 v1, p45

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->nestId:Ljava/lang/String;

    move-object/from16 v1, p46

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p47

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

    move/from16 v1, p48

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->peril:Z

    move/from16 v1, p49

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->deliverable:Z

    iput-object v10, v0, Lco/bird/android/model/wire/WireBird;->lifecycle:Lco/bird/android/model/wire/WireLifecycle;

    move/from16 v1, p51

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->offline:Z

    move-object/from16 v1, p52

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->license:Lco/bird/android/model/wire/WireBirdLicenseView;

    move-object/from16 v1, p53

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->areaKey:Ljava/lang/String;

    move-object/from16 v1, p54

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->fleetId:Ljava/lang/String;

    move-object/from16 v1, p55

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->nestPurpose:Lco/bird/android/model/constant/NestPurpose;

    move-object/from16 v1, p56

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->privateBird:Lco/bird/android/model/wire/WirePrivateBird;

    move-object/from16 v1, p57

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->scannedAt:Lorg/joda/time/DateTime;

    iput-object v11, v0, Lco/bird/android/model/wire/WireBird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    iput-object v12, v0, Lco/bird/android/model/wire/WireBird;->bountyReasons:Ljava/util/List;

    move/from16 v1, p60

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->isScanlessRideEligible:Z

    move-object/from16 v1, p61

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->ephemeralId:Ljava/lang/String;

    move/from16 v1, p62

    iput-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->hasHelmet:Z

    move-object/from16 v1, p63

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p64

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->bleMacAddress:Ljava/lang/String;

    move-object/from16 v1, p65

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->cellId:Ljava/lang/String;

    move-object/from16 v1, p66

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->externalFeedType:Ljava/lang/String;

    new-instance v1, Lco/bird/android/model/wire/WireBird$physicalLocks$2;

    invoke-direct {v1, p0}, Lco/bird/android/model/wire/WireBird$physicalLocks$2;-><init>(Lco/bird/android/model/wire/WireBird;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->physicalLocks$delegate:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/model/wire/WireBird$modelSpecificPhysicalLocks$2;

    invoke-direct {v1, p0}, Lco/bird/android/model/wire/WireBird$modelSpecificPhysicalLocks$2;-><init>(Lco/bird/android/model/wire/WireBird;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/model/wire/WireBird;->modelSpecificPhysicalLocks$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 64

    move/from16 v0, p67

    move/from16 v1, p68

    and-int/lit8 v2, v0, 0x1

    const-string v3, ""

    if-eqz v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v0, 0x2

    if-eqz v4, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    and-int/lit8 v6, v0, 0x4

    if-eqz v6, :cond_2

    const/4 v6, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v6, p3

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    const/4 v7, 0x0

    goto :goto_3

    :cond_3
    move/from16 v7, p4

    :goto_3
    and-int/lit8 v9, v0, 0x10

    if-eqz v9, :cond_4

    const/4 v9, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v9, p5

    :goto_4
    and-int/lit8 v10, v0, 0x20

    if-eqz v10, :cond_5

    const/4 v10, 0x0

    goto :goto_5

    :cond_5
    move/from16 v10, p6

    :goto_5
    and-int/lit8 v11, v0, 0x40

    if-eqz v11, :cond_6

    new-instance v11, Lco/bird/android/model/wire/WireLocation;

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1fc

    const/16 v25, 0x0

    move-object v12, v11

    invoke-direct/range {v12 .. v25}, Lco/bird/android/model/wire/WireLocation;-><init>(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_6

    :cond_6
    move-object/from16 v11, p7

    :goto_6
    and-int/lit16 v12, v0, 0x80

    if-eqz v12, :cond_7

    move-object v12, v3

    goto :goto_7

    :cond_7
    move-object/from16 v12, p8

    :goto_7
    and-int/lit16 v13, v0, 0x100

    if-eqz v13, :cond_8

    const/4 v13, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v13, p9

    :goto_8
    and-int/lit16 v14, v0, 0x200

    if-eqz v14, :cond_9

    goto :goto_9

    :cond_9
    move-object/from16 v3, p10

    :goto_9
    and-int/lit16 v14, v0, 0x400

    if-eqz v14, :cond_a

    const/4 v14, 0x0

    goto :goto_a

    :cond_a
    move/from16 v14, p11

    :goto_a
    and-int/lit16 v15, v0, 0x800

    if-eqz v15, :cond_b

    const/4 v15, 0x0

    goto :goto_b

    :cond_b
    move/from16 v15, p12

    :goto_b
    and-int/lit16 v5, v0, 0x1000

    if-eqz v5, :cond_c

    const/4 v5, 0x0

    goto :goto_c

    :cond_c
    move/from16 v5, p13

    :goto_c
    and-int/lit16 v8, v0, 0x2000

    if-eqz v8, :cond_d

    const/4 v8, 0x0

    goto :goto_d

    :cond_d
    move/from16 v8, p14

    :goto_d
    move/from16 p70, v8

    and-int/lit16 v8, v0, 0x4000

    const/16 v16, 0x1

    if-eqz v8, :cond_e

    move/from16 v8, v16

    goto :goto_e

    :cond_e
    move/from16 v8, p15

    :goto_e
    const v17, 0x8000

    and-int v18, v0, v17

    if-eqz v18, :cond_f

    goto :goto_f

    :cond_f
    move/from16 v16, p16

    :goto_f
    const/high16 v18, 0x10000

    and-int v19, v0, v18

    if-eqz v19, :cond_10

    const/16 v19, 0x0

    goto :goto_10

    :cond_10
    move/from16 v19, p17

    :goto_10
    const/high16 v20, 0x20000

    and-int v21, v0, v20

    if-eqz v21, :cond_11

    const/16 v21, 0x0

    goto :goto_11

    :cond_11
    move/from16 v21, p18

    :goto_11
    const/high16 v22, 0x40000

    and-int v23, v0, v22

    if-eqz v23, :cond_12

    const/16 v23, 0x0

    goto :goto_12

    :cond_12
    move/from16 v23, p19

    :goto_12
    const/high16 v24, 0x80000

    and-int v24, v0, v24

    if-eqz v24, :cond_13

    new-instance v24, Lco/bird/android/model/wire/WireBirdLabel;

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x1f

    const/16 v31, 0x0

    move-object/from16 p3, v24

    move-object/from16 p4, v25

    move/from16 p5, v26

    move-object/from16 p6, v27

    move-object/from16 p7, v28

    move-object/from16 p8, v29

    move/from16 p9, v30

    move-object/from16 p10, v31

    invoke-direct/range {p3 .. p10}, Lco/bird/android/model/wire/WireBirdLabel;-><init>(Ljava/lang/String;ILjava/lang/String;Lco/bird/android/model/constant/BirdBadgeType;Lco/bird/android/model/constant/ChargerBirdBadgeType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_13

    :cond_13
    move-object/from16 v24, p20

    :goto_13
    const/high16 v25, 0x100000

    and-int v25, v0, v25

    if-eqz v25, :cond_14

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v25

    goto :goto_14

    :cond_14
    move-object/from16 v25, p21

    :goto_14
    const/high16 v26, 0x200000

    and-int v26, v0, v26

    if-eqz v26, :cond_15

    const/16 v26, 0x0

    goto :goto_15

    :cond_15
    move-object/from16 v26, p22

    :goto_15
    const/high16 v27, 0x400000

    and-int v27, v0, v27

    if-eqz v27, :cond_16

    const/16 v27, 0x0

    goto :goto_16

    :cond_16
    move-object/from16 v27, p23

    :goto_16
    const/high16 v28, 0x800000

    and-int v28, v0, v28

    if-eqz v28, :cond_17

    const-string v28, "usd"

    goto :goto_17

    :cond_17
    move-object/from16 v28, p24

    :goto_17
    const/high16 v29, 0x1000000

    and-int v29, v0, v29

    if-eqz v29, :cond_18

    const/16 v29, 0x0

    goto :goto_18

    :cond_18
    move/from16 v29, p25

    :goto_18
    const/high16 v30, 0x2000000

    and-int v30, v0, v30

    if-eqz v30, :cond_19

    const/16 v30, 0x0

    goto :goto_19

    :cond_19
    move/from16 v30, p26

    :goto_19
    const/high16 v31, 0x4000000

    and-int v31, v0, v31

    if-eqz v31, :cond_1a

    sget-object v31, Lco/bird/android/model/constant/BountyKind;->UNKNOWN:Lco/bird/android/model/constant/BountyKind;

    goto :goto_1a

    :cond_1a
    move-object/from16 v31, p27

    :goto_1a
    const/high16 v32, 0x8000000

    and-int v32, v0, v32

    if-eqz v32, :cond_1b

    const/16 v32, 0x0

    goto :goto_1b

    :cond_1b
    move-object/from16 v32, p28

    :goto_1b
    const/high16 v33, 0x10000000

    and-int v33, v0, v33

    if-eqz v33, :cond_1c

    sget-object v33, Lco/bird/android/model/constant/BirdTaskKind;->UNKNOWN:Lco/bird/android/model/constant/BirdTaskKind;

    goto :goto_1c

    :cond_1c
    move-object/from16 v33, p29

    :goto_1c
    const/high16 v34, 0x20000000

    and-int v34, v0, v34

    if-eqz v34, :cond_1d

    const/16 v34, 0x0

    goto :goto_1d

    :cond_1d
    move-object/from16 v34, p30

    :goto_1d
    const/high16 v35, 0x40000000    # 2.0f

    and-int v35, v0, v35

    if-eqz v35, :cond_1e

    const/16 v35, 0x0

    goto :goto_1e

    :cond_1e
    move-object/from16 v35, p31

    :goto_1e
    const/high16 v36, -0x80000000

    and-int v0, v0, v36

    if-eqz v0, :cond_1f

    const/4 v0, 0x0

    goto :goto_1f

    :cond_1f
    move-object/from16 v0, p32

    :goto_1f
    and-int/lit8 v36, v1, 0x1

    if-eqz v36, :cond_20

    const/16 v36, 0x0

    goto :goto_20

    :cond_20
    move/from16 v36, p33

    :goto_20
    and-int/lit8 v37, v1, 0x2

    if-eqz v37, :cond_21

    const/16 v37, 0x0

    goto :goto_21

    :cond_21
    move/from16 v37, p34

    :goto_21
    and-int/lit8 v38, v1, 0x4

    if-eqz v38, :cond_22

    const/16 v38, 0x0

    goto :goto_22

    :cond_22
    move-object/from16 v38, p35

    :goto_22
    and-int/lit8 v39, v1, 0x8

    if-eqz v39, :cond_23

    const/16 v39, 0x0

    goto :goto_23

    :cond_23
    move-object/from16 v39, p36

    :goto_23
    and-int/lit8 v40, v1, 0x10

    if-eqz v40, :cond_24

    const/16 v40, 0x0

    goto :goto_24

    :cond_24
    move/from16 v40, p37

    :goto_24
    and-int/lit8 v41, v1, 0x20

    if-eqz v41, :cond_25

    const/16 v41, 0x0

    goto :goto_25

    :cond_25
    move-object/from16 v41, p38

    :goto_25
    and-int/lit8 v42, v1, 0x40

    if-eqz v42, :cond_26

    const/16 v42, 0x0

    goto :goto_26

    :cond_26
    move-object/from16 v42, p39

    :goto_26
    move-object/from16 p67, v0

    and-int/lit16 v0, v1, 0x80

    if-eqz v0, :cond_27

    const/4 v0, 0x0

    goto :goto_27

    :cond_27
    move-object/from16 v0, p40

    :goto_27
    move-object/from16 v43, v0

    and-int/lit16 v0, v1, 0x100

    if-eqz v0, :cond_28

    const/4 v0, 0x0

    goto :goto_28

    :cond_28
    move/from16 v0, p41

    :goto_28
    move/from16 v44, v0

    and-int/lit16 v0, v1, 0x200

    if-eqz v0, :cond_29

    const/4 v0, 0x0

    goto :goto_29

    :cond_29
    move/from16 v0, p42

    :goto_29
    move/from16 v45, v0

    and-int/lit16 v0, v1, 0x400

    if-eqz v0, :cond_2a

    const/4 v0, 0x0

    goto :goto_2a

    :cond_2a
    move/from16 v0, p43

    :goto_2a
    move/from16 v46, v0

    and-int/lit16 v0, v1, 0x800

    if-eqz v0, :cond_2b

    const/4 v0, 0x0

    goto :goto_2b

    :cond_2b
    move-object/from16 v0, p44

    :goto_2b
    move-object/from16 v47, v0

    and-int/lit16 v0, v1, 0x1000

    if-eqz v0, :cond_2c

    const/4 v0, 0x0

    goto :goto_2c

    :cond_2c
    move-object/from16 v0, p45

    :goto_2c
    move-object/from16 v48, v0

    and-int/lit16 v0, v1, 0x2000

    if-eqz v0, :cond_2d

    const/4 v0, 0x0

    goto :goto_2d

    :cond_2d
    move-object/from16 v0, p46

    :goto_2d
    move-object/from16 v49, v0

    and-int/lit16 v0, v1, 0x4000

    if-eqz v0, :cond_2e

    sget-object v0, Lco/bird/android/model/constant/PartnerBirdState;->UNKNOWN:Lco/bird/android/model/constant/PartnerBirdState;

    goto :goto_2e

    :cond_2e
    move-object/from16 v0, p47

    :goto_2e
    and-int v17, v1, v17

    if-eqz v17, :cond_2f

    const/16 v17, 0x0

    goto :goto_2f

    :cond_2f
    move/from16 v17, p48

    :goto_2f
    and-int v18, v1, v18

    if-eqz v18, :cond_30

    const/16 v18, 0x0

    goto :goto_30

    :cond_30
    move/from16 v18, p49

    :goto_30
    and-int v20, v1, v20

    if-eqz v20, :cond_31

    new-instance v20, Lco/bird/android/model/wire/WireLifecycle;

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0xf

    const/16 v55, 0x0

    move-object/from16 p3, v20

    move-object/from16 p4, v50

    move-object/from16 p5, v51

    move-object/from16 p6, v52

    move-object/from16 p7, v53

    move/from16 p8, v54

    move-object/from16 p9, v55

    invoke-direct/range {p3 .. p9}, Lco/bird/android/model/wire/WireLifecycle;-><init>(Lco/bird/android/model/constant/Condition;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/constant/BrainState;Lco/bird/android/model/constant/Placement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_31

    :cond_31
    move-object/from16 v20, p50

    :goto_31
    and-int v22, v1, v22

    if-eqz v22, :cond_32

    const/16 v22, 0x0

    goto :goto_32

    :cond_32
    move/from16 v22, p51

    :goto_32
    const/high16 v50, 0x80000

    and-int v50, v1, v50

    if-eqz v50, :cond_33

    const/16 v50, 0x0

    goto :goto_33

    :cond_33
    move-object/from16 v50, p52

    :goto_33
    const/high16 v51, 0x100000

    and-int v51, v1, v51

    if-eqz v51, :cond_34

    const/16 v51, 0x0

    goto :goto_34

    :cond_34
    move-object/from16 v51, p53

    :goto_34
    const/high16 v52, 0x200000

    and-int v52, v1, v52

    if-eqz v52, :cond_35

    const/16 v52, 0x0

    goto :goto_35

    :cond_35
    move-object/from16 v52, p54

    :goto_35
    const/high16 v53, 0x400000

    and-int v53, v1, v53

    if-eqz v53, :cond_36

    const/16 v53, 0x0

    goto :goto_36

    :cond_36
    move-object/from16 v53, p55

    :goto_36
    const/high16 v54, 0x800000

    and-int v54, v1, v54

    if-eqz v54, :cond_37

    const/16 v54, 0x0

    goto :goto_37

    :cond_37
    move-object/from16 v54, p56

    :goto_37
    const/high16 v55, 0x1000000

    and-int v55, v1, v55

    if-eqz v55, :cond_38

    const/16 v55, 0x0

    goto :goto_38

    :cond_38
    move-object/from16 v55, p57

    :goto_38
    const/high16 v56, 0x2000000

    and-int v56, v1, v56

    if-eqz v56, :cond_39

    sget-object v56, Lco/bird/android/model/constant/MapPinBadge;->UNKNOWN:Lco/bird/android/model/constant/MapPinBadge;

    goto :goto_39

    :cond_39
    move-object/from16 v56, p58

    :goto_39
    const/high16 v57, 0x4000000

    and-int v57, v1, v57

    if-eqz v57, :cond_3a

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v57

    goto :goto_3a

    :cond_3a
    move-object/from16 v57, p59

    :goto_3a
    const/high16 v58, 0x8000000

    and-int v58, v1, v58

    if-eqz v58, :cond_3b

    const/16 v58, 0x0

    goto :goto_3b

    :cond_3b
    move/from16 v58, p60

    :goto_3b
    const/high16 v59, 0x10000000

    and-int v59, v1, v59

    if-eqz v59, :cond_3c

    const/16 v59, 0x0

    goto :goto_3c

    :cond_3c
    move-object/from16 v59, p61

    :goto_3c
    const/high16 v60, 0x20000000

    and-int v60, v1, v60

    if-eqz v60, :cond_3d

    const/16 v60, 0x0

    goto :goto_3d

    :cond_3d
    move/from16 v60, p62

    :goto_3d
    const/high16 v61, 0x40000000    # 2.0f

    and-int v61, v1, v61

    if-eqz v61, :cond_3e

    const/16 v61, 0x0

    goto :goto_3e

    :cond_3e
    move-object/from16 v61, p63

    :goto_3e
    const/high16 v62, -0x80000000

    and-int v1, v1, v62

    if-eqz v1, :cond_3f

    const/4 v1, 0x0

    goto :goto_3f

    :cond_3f
    move-object/from16 v1, p64

    :goto_3f
    and-int/lit8 v62, p69, 0x1

    if-eqz v62, :cond_40

    const/16 v62, 0x0

    goto :goto_40

    :cond_40
    move-object/from16 v62, p65

    :goto_40
    and-int/lit8 v63, p69, 0x2

    if-eqz v63, :cond_41

    const/16 v63, 0x0

    goto :goto_41

    :cond_41
    move-object/from16 v63, p66

    :goto_41
    move-object/from16 p1, p0

    move-object/from16 p2, v2

    move-object/from16 p3, v4

    move-object/from16 p4, v6

    move/from16 p5, v7

    move-object/from16 p6, v9

    move/from16 p7, v10

    move-object/from16 p8, v11

    move-object/from16 p9, v12

    move-object/from16 p10, v13

    move-object/from16 p11, v3

    move/from16 p12, v14

    move/from16 p13, v15

    move/from16 p14, v5

    move/from16 p15, p70

    move/from16 p16, v8

    move/from16 p17, v16

    move/from16 p18, v19

    move/from16 p19, v21

    move/from16 p20, v23

    move-object/from16 p21, v24

    move-object/from16 p22, v25

    move-object/from16 p23, v26

    move-object/from16 p24, v27

    move-object/from16 p25, v28

    move/from16 p26, v29

    move/from16 p27, v30

    move-object/from16 p28, v31

    move-object/from16 p29, v32

    move-object/from16 p30, v33

    move-object/from16 p31, v34

    move-object/from16 p32, v35

    move-object/from16 p33, p67

    move/from16 p34, v36

    move/from16 p35, v37

    move-object/from16 p36, v38

    move-object/from16 p37, v39

    move/from16 p38, v40

    move-object/from16 p39, v41

    move-object/from16 p40, v42

    move-object/from16 p41, v43

    move/from16 p42, v44

    move/from16 p43, v45

    move/from16 p44, v46

    move-object/from16 p45, v47

    move-object/from16 p46, v48

    move-object/from16 p47, v49

    move-object/from16 p48, v0

    move/from16 p49, v17

    move/from16 p50, v18

    move-object/from16 p51, v20

    move/from16 p52, v22

    move-object/from16 p53, v50

    move-object/from16 p54, v51

    move-object/from16 p55, v52

    move-object/from16 p56, v53

    move-object/from16 p57, v54

    move-object/from16 p58, v55

    move-object/from16 p59, v56

    move-object/from16 p60, v57

    move/from16 p61, v58

    move-object/from16 p62, v59

    move/from16 p63, v60

    move-object/from16 p64, v61

    move-object/from16 p65, v1

    move-object/from16 p66, v62

    move-object/from16 p67, v63

    invoke-direct/range {p1 .. p67}, Lco/bird/android/model/wire/WireBird;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getDEFAULT_DUE_TIME_HOUR$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lco/bird/android/model/wire/WireBird;->DEFAULT_DUE_TIME_HOUR:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireBird;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)Lco/bird/android/model/wire/WireBird;
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p67

    move/from16 v2, p68

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget-object v3, v0, Lco/bird/android/model/wire/WireBird;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Lco/bird/android/model/wire/WireBird;->model:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lco/bird/android/model/wire/WireBird;->taskId:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget v6, v0, Lco/bird/android/model/wire/WireBird;->batteryLevel:I

    goto :goto_3

    :cond_3
    move/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lco/bird/android/model/wire/WireBird;->estimatedRange:Ljava/lang/Integer;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget v8, v0, Lco/bird/android/model/wire/WireBird;->distance:I

    goto :goto_5

    :cond_5
    move/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lco/bird/android/model/wire/WireBird;->location:Lco/bird/android/model/wire/WireLocation;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lco/bird/android/model/wire/WireBird;->code:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-object v11, v0, Lco/bird/android/model/wire/WireBird;->stickerId:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-object v12, v0, Lco/bird/android/model/wire/WireBird;->serialNumber:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-boolean v13, v0, Lco/bird/android/model/wire/WireBird;->disconnected:Z

    goto :goto_a

    :cond_a
    move/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-boolean v14, v0, Lco/bird/android/model/wire/WireBird;->collect:Z

    goto :goto_b

    :cond_b
    move/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-boolean v15, v0, Lco/bird/android/model/wire/WireBird;->submerged:Z

    goto :goto_c

    :cond_c
    move/from16 v15, p13

    :goto_c
    move/from16 p13, v15

    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-boolean v15, v0, Lco/bird/android/model/wire/WireBird;->lost:Z

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-boolean v15, v0, Lco/bird/android/model/wire/WireBird;->locked:Z

    goto :goto_e

    :cond_e
    move/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v17, v1, v16

    move/from16 p15, v15

    if-eqz v17, :cond_f

    iget-boolean v15, v0, Lco/bird/android/model/wire/WireBird;->ackLocked:Z

    goto :goto_f

    :cond_f
    move/from16 v15, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v18, v1, v17

    move/from16 p16, v15

    if-eqz v18, :cond_10

    iget-boolean v15, v0, Lco/bird/android/model/wire/WireBird;->captive:Z

    goto :goto_10

    :cond_10
    move/from16 v15, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v19, v1, v18

    move/from16 p17, v15

    if-eqz v19, :cond_11

    iget-boolean v15, v0, Lco/bird/android/model/wire/WireBird;->gpsFix:Z

    goto :goto_11

    :cond_11
    move/from16 v15, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v20, v1, v19

    move/from16 p18, v15

    if-eqz v20, :cond_12

    iget-boolean v15, v0, Lco/bird/android/model/wire/WireBird;->broken:Z

    goto :goto_12

    :cond_12
    move/from16 v15, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v21, v1, v20

    move/from16 p19, v15

    if-eqz v21, :cond_13

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->label:Lco/bird/android/model/wire/WireBirdLabel;

    goto :goto_13

    :cond_13
    move-object/from16 v15, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v22, v1, v21

    move-object/from16 p20, v15

    if-eqz v22, :cond_14

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->actions:Ljava/util/List;

    goto :goto_14

    :cond_14
    move-object/from16 v15, p21

    :goto_14
    const/high16 v22, 0x200000

    and-int v23, v1, v22

    move-object/from16 p21, v15

    if-eqz v23, :cond_15

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->bountyId:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v15, p22

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, v1, v23

    move-object/from16 p22, v15

    if-eqz v23, :cond_16

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->bountyPrice:Ljava/lang/Integer;

    goto :goto_16

    :cond_16
    move-object/from16 v15, p23

    :goto_16
    const/high16 v23, 0x800000

    and-int v23, v1, v23

    move-object/from16 p23, v15

    if-eqz v23, :cond_17

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->bountyCurrency:Ljava/lang/String;

    goto :goto_17

    :cond_17
    move-object/from16 v15, p24

    :goto_17
    const/high16 v23, 0x1000000

    and-int v23, v1, v23

    move-object/from16 p24, v15

    if-eqz v23, :cond_18

    iget-boolean v15, v0, Lco/bird/android/model/wire/WireBird;->bountyLost:Z

    goto :goto_18

    :cond_18
    move/from16 v15, p25

    :goto_18
    const/high16 v23, 0x2000000

    and-int v23, v1, v23

    move/from16 p25, v15

    if-eqz v23, :cond_19

    iget-boolean v15, v0, Lco/bird/android/model/wire/WireBird;->bountyOverdue:Z

    goto :goto_19

    :cond_19
    move/from16 v15, p26

    :goto_19
    const/high16 v23, 0x4000000

    and-int v23, v1, v23

    move/from16 p26, v15

    if-eqz v23, :cond_1a

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->bountyKind:Lco/bird/android/model/constant/BountyKind;

    goto :goto_1a

    :cond_1a
    move-object/from16 v15, p27

    :goto_1a
    const/high16 v23, 0x8000000

    and-int v23, v1, v23

    move-object/from16 p27, v15

    if-eqz v23, :cond_1b

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->brandName:Ljava/lang/String;

    goto :goto_1b

    :cond_1b
    move-object/from16 v15, p28

    :goto_1b
    const/high16 v23, 0x10000000

    and-int v23, v1, v23

    move-object/from16 p28, v15

    if-eqz v23, :cond_1c

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->taskKind:Lco/bird/android/model/constant/BirdTaskKind;

    goto :goto_1c

    :cond_1c
    move-object/from16 v15, p29

    :goto_1c
    const/high16 v23, 0x20000000

    and-int v23, v1, v23

    move-object/from16 p29, v15

    if-eqz v23, :cond_1d

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->gpsAt:Lorg/joda/time/DateTime;

    goto :goto_1d

    :cond_1d
    move-object/from16 v15, p30

    :goto_1d
    const/high16 v23, 0x40000000    # 2.0f

    and-int v23, v1, v23

    move-object/from16 p30, v15

    if-eqz v23, :cond_1e

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->trackedAt:Lorg/joda/time/DateTime;

    goto :goto_1e

    :cond_1e
    move-object/from16 v15, p31

    :goto_1e
    const/high16 v23, -0x80000000

    and-int v1, v1, v23

    if-eqz v1, :cond_1f

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->token:Ljava/lang/String;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p32

    :goto_1f
    and-int/lit8 v23, v2, 0x1

    move-object/from16 p32, v1

    if-eqz v23, :cond_20

    iget-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->bluetooth:Z

    goto :goto_20

    :cond_20
    move/from16 v1, p33

    :goto_20
    and-int/lit8 v23, v2, 0x2

    move/from16 p33, v1

    if-eqz v23, :cond_21

    iget-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->cellular:Z

    goto :goto_21

    :cond_21
    move/from16 v1, p34

    :goto_21
    and-int/lit8 v23, v2, 0x4

    move/from16 p34, v1

    if-eqz v23, :cond_22

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->startedAt:Lorg/joda/time/DateTime;

    goto :goto_22

    :cond_22
    move-object/from16 v1, p35

    :goto_22
    and-int/lit8 v23, v2, 0x8

    move-object/from16 p35, v1

    if-eqz v23, :cond_23

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->dueAt:Lorg/joda/time/DateTime;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p36

    :goto_23
    and-int/lit8 v23, v2, 0x10

    move-object/from16 p36, v1

    if-eqz v23, :cond_24

    iget-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->asleep:Z

    goto :goto_24

    :cond_24
    move/from16 v1, p37

    :goto_24
    and-int/lit8 v23, v2, 0x20

    move/from16 p37, v1

    if-eqz v23, :cond_25

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->imei:Ljava/lang/String;

    goto :goto_25

    :cond_25
    move-object/from16 v1, p38

    :goto_25
    and-int/lit8 v23, v2, 0x40

    move-object/from16 p38, v1

    if-eqz v23, :cond_26

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->boardProtocol:Ljava/lang/String;

    goto :goto_26

    :cond_26
    move-object/from16 v1, p39

    :goto_26
    move-object/from16 p39, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->physicalLock:Lco/bird/android/model/wire/WirePhysicalLock;

    goto :goto_27

    :cond_27
    move-object/from16 v1, p40

    :goto_27
    move-object/from16 p40, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->priorityCollect:Z

    goto :goto_28

    :cond_28
    move/from16 v1, p41

    :goto_28
    move/from16 p41, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->down:Z

    goto :goto_29

    :cond_29
    move/from16 v1, p42

    :goto_29
    move/from16 p42, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->needsInspection:Z

    goto :goto_2a

    :cond_2a
    move/from16 v1, p43

    :goto_2a
    move/from16 p43, v1

    and-int/lit16 v1, v2, 0x800

    if-eqz v1, :cond_2b

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->partnerId:Ljava/lang/String;

    goto :goto_2b

    :cond_2b
    move-object/from16 v1, p44

    :goto_2b
    move-object/from16 p44, v1

    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_2c

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->nestId:Ljava/lang/String;

    goto :goto_2c

    :cond_2c
    move-object/from16 v1, p45

    :goto_2c
    move-object/from16 p45, v1

    and-int/lit16 v1, v2, 0x2000

    if-eqz v1, :cond_2d

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    goto :goto_2d

    :cond_2d
    move-object/from16 v1, p46

    :goto_2d
    move-object/from16 p46, v1

    and-int/lit16 v1, v2, 0x4000

    if-eqz v1, :cond_2e

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

    goto :goto_2e

    :cond_2e
    move-object/from16 v1, p47

    :goto_2e
    and-int v16, v2, v16

    move-object/from16 p47, v1

    if-eqz v16, :cond_2f

    iget-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->peril:Z

    goto :goto_2f

    :cond_2f
    move/from16 v1, p48

    :goto_2f
    and-int v16, v2, v17

    move/from16 p48, v1

    if-eqz v16, :cond_30

    iget-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->deliverable:Z

    goto :goto_30

    :cond_30
    move/from16 v1, p49

    :goto_30
    and-int v16, v2, v18

    move/from16 p49, v1

    if-eqz v16, :cond_31

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->lifecycle:Lco/bird/android/model/wire/WireLifecycle;

    goto :goto_31

    :cond_31
    move-object/from16 v1, p50

    :goto_31
    and-int v16, v2, v19

    move-object/from16 p50, v1

    if-eqz v16, :cond_32

    iget-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->offline:Z

    goto :goto_32

    :cond_32
    move/from16 v1, p51

    :goto_32
    and-int v16, v2, v20

    move/from16 p51, v1

    if-eqz v16, :cond_33

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->license:Lco/bird/android/model/wire/WireBirdLicenseView;

    goto :goto_33

    :cond_33
    move-object/from16 v1, p52

    :goto_33
    and-int v16, v2, v21

    move-object/from16 p52, v1

    if-eqz v16, :cond_34

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->areaKey:Ljava/lang/String;

    goto :goto_34

    :cond_34
    move-object/from16 v1, p53

    :goto_34
    and-int v16, v2, v22

    move-object/from16 p53, v1

    if-eqz v16, :cond_35

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->fleetId:Ljava/lang/String;

    goto :goto_35

    :cond_35
    move-object/from16 v1, p54

    :goto_35
    const/high16 v16, 0x400000

    and-int v16, v2, v16

    move-object/from16 p54, v1

    if-eqz v16, :cond_36

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->nestPurpose:Lco/bird/android/model/constant/NestPurpose;

    goto :goto_36

    :cond_36
    move-object/from16 v1, p55

    :goto_36
    const/high16 v16, 0x800000

    and-int v16, v2, v16

    move-object/from16 p55, v1

    if-eqz v16, :cond_37

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->privateBird:Lco/bird/android/model/wire/WirePrivateBird;

    goto :goto_37

    :cond_37
    move-object/from16 v1, p56

    :goto_37
    const/high16 v16, 0x1000000

    and-int v16, v2, v16

    move-object/from16 p56, v1

    if-eqz v16, :cond_38

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->scannedAt:Lorg/joda/time/DateTime;

    goto :goto_38

    :cond_38
    move-object/from16 v1, p57

    :goto_38
    const/high16 v16, 0x2000000

    and-int v16, v2, v16

    move-object/from16 p57, v1

    if-eqz v16, :cond_39

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    goto :goto_39

    :cond_39
    move-object/from16 v1, p58

    :goto_39
    const/high16 v16, 0x4000000

    and-int v16, v2, v16

    move-object/from16 p58, v1

    if-eqz v16, :cond_3a

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->bountyReasons:Ljava/util/List;

    goto :goto_3a

    :cond_3a
    move-object/from16 v1, p59

    :goto_3a
    const/high16 v16, 0x8000000

    and-int v16, v2, v16

    move-object/from16 p59, v1

    if-eqz v16, :cond_3b

    iget-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->isScanlessRideEligible:Z

    goto :goto_3b

    :cond_3b
    move/from16 v1, p60

    :goto_3b
    const/high16 v16, 0x10000000

    and-int v16, v2, v16

    move/from16 p60, v1

    if-eqz v16, :cond_3c

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->ephemeralId:Ljava/lang/String;

    goto :goto_3c

    :cond_3c
    move-object/from16 v1, p61

    :goto_3c
    const/high16 v16, 0x20000000

    and-int v16, v2, v16

    move-object/from16 p61, v1

    if-eqz v16, :cond_3d

    iget-boolean v1, v0, Lco/bird/android/model/wire/WireBird;->hasHelmet:Z

    goto :goto_3d

    :cond_3d
    move/from16 v1, p62

    :goto_3d
    const/high16 v16, 0x40000000    # 2.0f

    and-int v16, v2, v16

    move/from16 p62, v1

    if-eqz v16, :cond_3e

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    goto :goto_3e

    :cond_3e
    move-object/from16 v1, p63

    :goto_3e
    const/high16 v16, -0x80000000

    and-int v2, v2, v16

    if-eqz v2, :cond_3f

    iget-object v2, v0, Lco/bird/android/model/wire/WireBird;->bleMacAddress:Ljava/lang/String;

    goto :goto_3f

    :cond_3f
    move-object/from16 v2, p64

    :goto_3f
    and-int/lit8 v16, p69, 0x1

    move-object/from16 p64, v2

    if-eqz v16, :cond_40

    iget-object v2, v0, Lco/bird/android/model/wire/WireBird;->cellId:Ljava/lang/String;

    goto :goto_40

    :cond_40
    move-object/from16 v2, p65

    :goto_40
    and-int/lit8 v16, p69, 0x2

    move-object/from16 p65, v2

    if-eqz v16, :cond_41

    iget-object v2, v0, Lco/bird/android/model/wire/WireBird;->externalFeedType:Ljava/lang/String;

    goto :goto_41

    :cond_41
    move-object/from16 v2, p66

    :goto_41
    move-object/from16 p1, v3

    move-object/from16 p2, v4

    move-object/from16 p3, v5

    move/from16 p4, v6

    move-object/from16 p5, v7

    move/from16 p6, v8

    move-object/from16 p7, v9

    move-object/from16 p8, v10

    move-object/from16 p9, v11

    move-object/from16 p10, v12

    move/from16 p11, v13

    move/from16 p12, v14

    move-object/from16 p31, v15

    move-object/from16 p63, v1

    move-object/from16 p66, v2

    invoke-virtual/range {p0 .. p66}, Lco/bird/android/model/wire/WireBird;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getModelSpecificPhysicalLocks$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getPhysicalLock$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "use physicalLocks"
    .end annotation

    return-void
.end method

.method public static synthetic getPhysicalLocks$annotations()V
    .locals 0

    return-void
.end method

.method private static final isProbablySame$lambda$0(Lkotlin/Lazy;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final isProbablySame$lambda$1(Lkotlin/Lazy;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final isProbablySame$lambda$2(Lkotlin/Lazy;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final isProbablySame$lambda$3(Lkotlin/Lazy;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->serialNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->disconnected:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->collect:Z

    return v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->submerged:Z

    return v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->lost:Z

    return v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->locked:Z

    return v0
.end method

.method public final component16()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->ackLocked:Z

    return v0
.end method

.method public final component17()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->captive:Z

    return v0
.end method

.method public final component18()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->gpsFix:Z

    return v0
.end method

.method public final component19()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->broken:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->model:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Lco/bird/android/model/wire/WireBirdLabel;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->label:Lco/bird/android/model/wire/WireBirdLabel;

    return-object v0
.end method

.method public final component21()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/BirdAction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->actions:Ljava/util/List;

    return-object v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bountyId:Ljava/lang/String;

    return-object v0
.end method

.method public final component23()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bountyPrice:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component24()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bountyCurrency:Ljava/lang/String;

    return-object v0
.end method

.method public final component25()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->bountyLost:Z

    return v0
.end method

.method public final component26()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->bountyOverdue:Z

    return v0
.end method

.method public final component27()Lco/bird/android/model/constant/BountyKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bountyKind:Lco/bird/android/model/constant/BountyKind;

    return-object v0
.end method

.method public final component28()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->brandName:Ljava/lang/String;

    return-object v0
.end method

.method public final component29()Lco/bird/android/model/constant/BirdTaskKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->taskKind:Lco/bird/android/model/constant/BirdTaskKind;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->taskId:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->gpsAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component31()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->trackedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component32()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->token:Ljava/lang/String;

    return-object v0
.end method

.method public final component33()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->bluetooth:Z

    return v0
.end method

.method public final component34()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->cellular:Z

    return v0
.end method

.method public final component35()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->startedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component36()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->dueAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component37()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->asleep:Z

    return v0
.end method

.method public final component38()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->imei:Ljava/lang/String;

    return-object v0
.end method

.method public final component39()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->boardProtocol:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireBird;->batteryLevel:I

    return v0
.end method

.method public final component40()Lco/bird/android/model/wire/WirePhysicalLock;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->physicalLock:Lco/bird/android/model/wire/WirePhysicalLock;

    return-object v0
.end method

.method public final component41()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->priorityCollect:Z

    return v0
.end method

.method public final component42()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->down:Z

    return v0
.end method

.method public final component43()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->needsInspection:Z

    return v0
.end method

.method public final component44()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public final component45()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->nestId:Ljava/lang/String;

    return-object v0
.end method

.method public final component46()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component47()Lco/bird/android/model/constant/PartnerBirdState;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

    return-object v0
.end method

.method public final component48()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->peril:Z

    return v0
.end method

.method public final component49()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->deliverable:Z

    return v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->estimatedRange:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component50()Lco/bird/android/model/wire/WireLifecycle;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->lifecycle:Lco/bird/android/model/wire/WireLifecycle;

    return-object v0
.end method

.method public final component51()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->offline:Z

    return v0
.end method

.method public final component52()Lco/bird/android/model/wire/WireBirdLicenseView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->license:Lco/bird/android/model/wire/WireBirdLicenseView;

    return-object v0
.end method

.method public final component53()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->areaKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component54()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->fleetId:Ljava/lang/String;

    return-object v0
.end method

.method public final component55()Lco/bird/android/model/constant/NestPurpose;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->nestPurpose:Lco/bird/android/model/constant/NestPurpose;

    return-object v0
.end method

.method public final component56()Lco/bird/android/model/wire/WirePrivateBird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->privateBird:Lco/bird/android/model/wire/WirePrivateBird;

    return-object v0
.end method

.method public final component57()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->scannedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component58()Lco/bird/android/model/constant/MapPinBadge;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    return-object v0
.end method

.method public final component59()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBountyReason;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bountyReasons:Ljava/util/List;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireBird;->distance:I

    return v0
.end method

.method public final component60()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->isScanlessRideEligible:Z

    return v0
.end method

.method public final component61()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->ephemeralId:Ljava/lang/String;

    return-object v0
.end method

.method public final component62()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->hasHelmet:Z

    return v0
.end method

.method public final component63()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component64()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bleMacAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final component65()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->cellId:Ljava/lang/String;

    return-object v0
.end method

.method public final component66()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->externalFeedType:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lco/bird/android/model/wire/WireLocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->location:Lco/bird/android/model/wire/WireLocation;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->stickerId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireBird;
    .locals 69
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Integer;",
            "I",
            "Lco/bird/android/model/wire/WireLocation;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZZZZZZZ",
            "Lco/bird/android/model/wire/WireBirdLabel;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/BirdAction;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "ZZ",
            "Lco/bird/android/model/constant/BountyKind;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/BirdTaskKind;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/lang/String;",
            "ZZ",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            "ZZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            "Lco/bird/android/model/constant/PartnerBirdState;",
            "ZZ",
            "Lco/bird/android/model/wire/WireLifecycle;",
            "Z",
            "Lco/bird/android/model/wire/WireBirdLicenseView;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/NestPurpose;",
            "Lco/bird/android/model/wire/WirePrivateBird;",
            "Lorg/joda/time/DateTime;",
            "Lco/bird/android/model/constant/MapPinBadge;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBountyReason;",
            ">;Z",
            "Ljava/lang/String;",
            "Z",
            "Lorg/joda/time/DateTime;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lco/bird/android/model/wire/WireBird;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    move-object/from16 v23, p23

    move-object/from16 v24, p24

    move/from16 v25, p25

    move/from16 v26, p26

    move-object/from16 v27, p27

    move-object/from16 v28, p28

    move-object/from16 v29, p29

    move-object/from16 v30, p30

    move-object/from16 v31, p31

    move-object/from16 v32, p32

    move/from16 v33, p33

    move/from16 v34, p34

    move-object/from16 v35, p35

    move-object/from16 v36, p36

    move/from16 v37, p37

    move-object/from16 v38, p38

    move-object/from16 v39, p39

    move-object/from16 v40, p40

    move/from16 v41, p41

    move/from16 v42, p42

    move/from16 v43, p43

    move-object/from16 v44, p44

    move-object/from16 v45, p45

    move-object/from16 v46, p46

    move-object/from16 v47, p47

    move/from16 v48, p48

    move/from16 v49, p49

    move-object/from16 v50, p50

    move/from16 v51, p51

    move-object/from16 v52, p52

    move-object/from16 v53, p53

    move-object/from16 v54, p54

    move-object/from16 v55, p55

    move-object/from16 v56, p56

    move-object/from16 v57, p57

    move-object/from16 v58, p58

    move-object/from16 v59, p59

    move/from16 v60, p60

    move-object/from16 v61, p61

    move/from16 v62, p62

    move-object/from16 v63, p63

    move-object/from16 v64, p64

    move-object/from16 v65, p65

    move-object/from16 v66, p66

    const-string v0, "id"

    move-object/from16 v67, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "code"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialNumber"

    move-object/from16 v1, p10

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    move-object/from16 v1, p20

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actions"

    move-object/from16 v1, p21

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bountyCurrency"

    move-object/from16 v1, p24

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bountyKind"

    move-object/from16 v1, p27

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskKind"

    move-object/from16 v1, p29

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    move-object/from16 v1, p50

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "badgeType"

    move-object/from16 v1, p58

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bountyReasons"

    move-object/from16 v1, p59

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v68, Lco/bird/android/model/wire/WireBird;

    move-object/from16 v0, v68

    move-object/from16 v1, v67

    invoke-direct/range {v0 .. v66}, Lco/bird/android/model/wire/WireBird;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v68
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireBird;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireBird;

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->model:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->model:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->taskId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->taskId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lco/bird/android/model/wire/WireBird;->batteryLevel:I

    iget v3, p1, Lco/bird/android/model/wire/WireBird;->batteryLevel:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->estimatedRange:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->estimatedRange:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/bird/android/model/wire/WireBird;->distance:I

    iget v3, p1, Lco/bird/android/model/wire/WireBird;->distance:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->location:Lco/bird/android/model/wire/WireLocation;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->location:Lco/bird/android/model/wire/WireLocation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->code:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->code:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->stickerId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->stickerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->serialNumber:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->serialNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->disconnected:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->disconnected:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->collect:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->collect:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->submerged:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->submerged:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->lost:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->lost:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->locked:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->locked:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->ackLocked:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->ackLocked:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->captive:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->captive:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->gpsFix:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->gpsFix:Z

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->broken:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->broken:Z

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->label:Lco/bird/android/model/wire/WireBirdLabel;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->label:Lco/bird/android/model/wire/WireBirdLabel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->actions:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->actions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->bountyId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->bountyId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->bountyPrice:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->bountyPrice:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->bountyCurrency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->bountyCurrency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->bountyLost:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->bountyLost:Z

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->bountyOverdue:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->bountyOverdue:Z

    if-eq v1, v3, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->bountyKind:Lco/bird/android/model/constant/BountyKind;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->bountyKind:Lco/bird/android/model/constant/BountyKind;

    if-eq v1, v3, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->brandName:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->brandName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->taskKind:Lco/bird/android/model/constant/BirdTaskKind;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->taskKind:Lco/bird/android/model/constant/BirdTaskKind;

    if-eq v1, v3, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->gpsAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->gpsAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->trackedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->trackedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->token:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->token:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->bluetooth:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->bluetooth:Z

    if-eq v1, v3, :cond_22

    return v2

    :cond_22
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->cellular:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->cellular:Z

    if-eq v1, v3, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->startedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->startedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->dueAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->dueAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->asleep:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->asleep:Z

    if-eq v1, v3, :cond_26

    return v2

    :cond_26
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->imei:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->imei:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->boardProtocol:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->boardProtocol:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    return v2

    :cond_28
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->physicalLock:Lco/bird/android/model/wire/WirePhysicalLock;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->physicalLock:Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    return v2

    :cond_29
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->priorityCollect:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->priorityCollect:Z

    if-eq v1, v3, :cond_2a

    return v2

    :cond_2a
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->down:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->down:Z

    if-eq v1, v3, :cond_2b

    return v2

    :cond_2b
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->needsInspection:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->needsInspection:Z

    if-eq v1, v3, :cond_2c

    return v2

    :cond_2c
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->partnerId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->partnerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    return v2

    :cond_2d
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->nestId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->nestId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    return v2

    :cond_2e
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    return v2

    :cond_2f
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

    if-eq v1, v3, :cond_30

    return v2

    :cond_30
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->peril:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->peril:Z

    if-eq v1, v3, :cond_31

    return v2

    :cond_31
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->deliverable:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->deliverable:Z

    if-eq v1, v3, :cond_32

    return v2

    :cond_32
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->lifecycle:Lco/bird/android/model/wire/WireLifecycle;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->lifecycle:Lco/bird/android/model/wire/WireLifecycle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    return v2

    :cond_33
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->offline:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->offline:Z

    if-eq v1, v3, :cond_34

    return v2

    :cond_34
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->license:Lco/bird/android/model/wire/WireBirdLicenseView;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->license:Lco/bird/android/model/wire/WireBirdLicenseView;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_35

    return v2

    :cond_35
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->areaKey:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->areaKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_36

    return v2

    :cond_36
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->fleetId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->fleetId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_37

    return v2

    :cond_37
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->nestPurpose:Lco/bird/android/model/constant/NestPurpose;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->nestPurpose:Lco/bird/android/model/constant/NestPurpose;

    if-eq v1, v3, :cond_38

    return v2

    :cond_38
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->privateBird:Lco/bird/android/model/wire/WirePrivateBird;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->privateBird:Lco/bird/android/model/wire/WirePrivateBird;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_39

    return v2

    :cond_39
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->scannedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->scannedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3a

    return v2

    :cond_3a
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    if-eq v1, v3, :cond_3b

    return v2

    :cond_3b
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->bountyReasons:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->bountyReasons:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3c

    return v2

    :cond_3c
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->isScanlessRideEligible:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->isScanlessRideEligible:Z

    if-eq v1, v3, :cond_3d

    return v2

    :cond_3d
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->ephemeralId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->ephemeralId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3e

    return v2

    :cond_3e
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->hasHelmet:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireBird;->hasHelmet:Z

    if-eq v1, v3, :cond_3f

    return v2

    :cond_3f
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_40

    return v2

    :cond_40
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->bleMacAddress:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->bleMacAddress:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_41

    return v2

    :cond_41
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->cellId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->cellId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_42

    return v2

    :cond_42
    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->externalFeedType:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/wire/WireBird;->externalFeedType:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_43

    return v2

    :cond_43
    return v0
.end method

.method public final getAckLocked()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->ackLocked:Z

    return v0
.end method

.method public final getActions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/BirdAction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->actions:Ljava/util/List;

    return-object v0
.end method

.method public final getAreaKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->areaKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getAsleep()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->asleep:Z

    return v0
.end method

.method public final getBadgeType()Lco/bird/android/model/constant/MapPinBadge;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    return-object v0
.end method

.method public final getBatteryLevel()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireBird;->batteryLevel:I

    return v0
.end method

.method public final getBleMacAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bleMacAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getBluetooth()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->bluetooth:Z

    return v0
.end method

.method public final getBoardProtocol()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->boardProtocol:Ljava/lang/String;

    return-object v0
.end method

.method public final getBountyCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bountyCurrency:Ljava/lang/String;

    return-object v0
.end method

.method public final getBountyId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bountyId:Ljava/lang/String;

    return-object v0
.end method

.method public final getBountyKind()Lco/bird/android/model/constant/BountyKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bountyKind:Lco/bird/android/model/constant/BountyKind;

    return-object v0
.end method

.method public final getBountyLost()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->bountyLost:Z

    return v0
.end method

.method public final getBountyOverdue()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->bountyOverdue:Z

    return v0
.end method

.method public final getBountyPrice()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bountyPrice:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getBountyReasons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBountyReason;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bountyReasons:Ljava/util/List;

    return-object v0
.end method

.method public final getBrandName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->brandName:Ljava/lang/String;

    return-object v0
.end method

.method public final getBroken()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->broken:Z

    return v0
.end method

.method public final getCaptive()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->captive:Z

    return v0
.end method

.method public final getCellId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->cellId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCellular()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->cellular:Z

    return v0
.end method

.method public final getCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final getCollect()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->collect:Z

    return v0
.end method

.method public final getDeliverable()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->deliverable:Z

    return v0
.end method

.method public final getDisconnected()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->disconnected:Z

    return v0
.end method

.method public final getDistance()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireBird;->distance:I

    return v0
.end method

.method public final getDown()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->down:Z

    return v0
.end method

.method public final getDueAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->dueAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getEphemeralId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->ephemeralId:Ljava/lang/String;

    return-object v0
.end method

.method public final getEstimatedRange()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->estimatedRange:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getExternalFeedType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->externalFeedType:Ljava/lang/String;

    return-object v0
.end method

.method public final getFleetId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->fleetId:Ljava/lang/String;

    return-object v0
.end method

.method public final getGpsAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->gpsAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getGpsFix()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->gpsFix:Z

    return v0
.end method

.method public final getHasHelmet()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->hasHelmet:Z

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImei()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->imei:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabel()Lco/bird/android/model/wire/WireBirdLabel;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->label:Lco/bird/android/model/wire/WireBirdLabel;

    return-object v0
.end method

.method public final getLastRideEndedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getLicense()Lco/bird/android/model/wire/WireBirdLicenseView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->license:Lco/bird/android/model/wire/WireBirdLicenseView;

    return-object v0
.end method

.method public final getLifecycle()Lco/bird/android/model/wire/WireLifecycle;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->lifecycle:Lco/bird/android/model/wire/WireLifecycle;

    return-object v0
.end method

.method public final getLocation()Lco/bird/android/model/wire/WireLocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->location:Lco/bird/android/model/wire/WireLocation;

    return-object v0
.end method

.method public final getLocationUpdatedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getLocked()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->locked:Z

    return v0
.end method

.method public final getLost()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->lost:Z

    return v0
.end method

.method public final getModel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->model:Ljava/lang/String;

    return-object v0
.end method

.method public final getModelSpecificPhysicalLocks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->modelSpecificPhysicalLocks$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getNeedsInspection()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->needsInspection:Z

    return v0
.end method

.method public final getNestId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->nestId:Ljava/lang/String;

    return-object v0
.end method

.method public final getNestPurpose()Lco/bird/android/model/constant/NestPurpose;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->nestPurpose:Lco/bird/android/model/constant/NestPurpose;

    return-object v0
.end method

.method public final getOffline()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->offline:Z

    return v0
.end method

.method public final getPartnerBirdState()Lco/bird/android/model/constant/PartnerBirdState;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

    return-object v0
.end method

.method public final getPartnerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPeril()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->peril:Z

    return v0
.end method

.method public final getPhysicalLock()Lco/bird/android/model/wire/WirePhysicalLock;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->physicalLock:Lco/bird/android/model/wire/WirePhysicalLock;

    return-object v0
.end method

.method public final getPhysicalLocks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->physicalLocks$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getPriorityCollect()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->priorityCollect:Z

    return v0
.end method

.method public final getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->privateBird:Lco/bird/android/model/wire/WirePrivateBird;

    return-object v0
.end method

.method public final getScannedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->scannedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getSerialNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->serialNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->startedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getStickerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->stickerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmerged()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->submerged:Z

    return v0
.end method

.method public final getTaskId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->taskId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTaskKind()Lco/bird/android/model/constant/BirdTaskKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->taskKind:Lco/bird/android/model/constant/BirdTaskKind;

    return-object v0
.end method

.method public final getToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->token:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->trackedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->model:Ljava/lang/String;

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

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->taskId:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/WireBird;->batteryLevel:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->estimatedRange:Ljava/lang/Integer;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/WireBird;->distance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->location:Lco/bird/android/model/wire/WireLocation;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireLocation;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->code:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->stickerId:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->serialNumber:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->disconnected:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    move v1, v3

    :cond_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->collect:Z

    if-eqz v1, :cond_5

    move v1, v3

    :cond_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->submerged:Z

    if-eqz v1, :cond_6

    move v1, v3

    :cond_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->lost:Z

    if-eqz v1, :cond_7

    move v1, v3

    :cond_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->locked:Z

    if-eqz v1, :cond_8

    move v1, v3

    :cond_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->ackLocked:Z

    if-eqz v1, :cond_9

    move v1, v3

    :cond_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->captive:Z

    if-eqz v1, :cond_a

    move v1, v3

    :cond_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->gpsFix:Z

    if-eqz v1, :cond_b

    move v1, v3

    :cond_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->broken:Z

    if-eqz v1, :cond_c

    move v1, v3

    :cond_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->label:Lco/bird/android/model/wire/WireBirdLabel;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBirdLabel;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->actions:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->bountyId:Ljava/lang/String;

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_4

    :cond_d
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->bountyPrice:Ljava/lang/Integer;

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_5

    :cond_e
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->bountyCurrency:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->bountyLost:Z

    if-eqz v1, :cond_f

    move v1, v3

    :cond_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->bountyOverdue:Z

    if-eqz v1, :cond_10

    move v1, v3

    :cond_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->bountyKind:Lco/bird/android/model/constant/BountyKind;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->brandName:Ljava/lang/String;

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_6

    :cond_11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->taskKind:Lco/bird/android/model/constant/BirdTaskKind;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->gpsAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_12

    move v1, v2

    goto :goto_7

    :cond_12
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->trackedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_13

    move v1, v2

    goto :goto_8

    :cond_13
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->token:Ljava/lang/String;

    if-nez v1, :cond_14

    move v1, v2

    goto :goto_9

    :cond_14
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->bluetooth:Z

    if-eqz v1, :cond_15

    move v1, v3

    :cond_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->cellular:Z

    if-eqz v1, :cond_16

    move v1, v3

    :cond_16
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->startedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_17

    move v1, v2

    goto :goto_a

    :cond_17
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->dueAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_18

    move v1, v2

    goto :goto_b

    :cond_18
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->asleep:Z

    if-eqz v1, :cond_19

    move v1, v3

    :cond_19
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->imei:Ljava/lang/String;

    if-nez v1, :cond_1a

    move v1, v2

    goto :goto_c

    :cond_1a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->boardProtocol:Ljava/lang/String;

    if-nez v1, :cond_1b

    move v1, v2

    goto :goto_d

    :cond_1b
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->physicalLock:Lco/bird/android/model/wire/WirePhysicalLock;

    if-nez v1, :cond_1c

    move v1, v2

    goto :goto_e

    :cond_1c
    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->priorityCollect:Z

    if-eqz v1, :cond_1d

    move v1, v3

    :cond_1d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->down:Z

    if-eqz v1, :cond_1e

    move v1, v3

    :cond_1e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->needsInspection:Z

    if-eqz v1, :cond_1f

    move v1, v3

    :cond_1f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->partnerId:Ljava/lang/String;

    if-nez v1, :cond_20

    move v1, v2

    goto :goto_f

    :cond_20
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->nestId:Ljava/lang/String;

    if-nez v1, :cond_21

    move v1, v2

    goto :goto_10

    :cond_21
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_22

    move v1, v2

    goto :goto_11

    :cond_22
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_11
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

    if-nez v1, :cond_23

    move v1, v2

    goto :goto_12

    :cond_23
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_12
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->peril:Z

    if-eqz v1, :cond_24

    move v1, v3

    :cond_24
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->deliverable:Z

    if-eqz v1, :cond_25

    move v1, v3

    :cond_25
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->lifecycle:Lco/bird/android/model/wire/WireLifecycle;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireLifecycle;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->offline:Z

    if-eqz v1, :cond_26

    move v1, v3

    :cond_26
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->license:Lco/bird/android/model/wire/WireBirdLicenseView;

    if-nez v1, :cond_27

    move v1, v2

    goto :goto_13

    :cond_27
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBirdLicenseView;->hashCode()I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->areaKey:Ljava/lang/String;

    if-nez v1, :cond_28

    move v1, v2

    goto :goto_14

    :cond_28
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_14
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->fleetId:Ljava/lang/String;

    if-nez v1, :cond_29

    move v1, v2

    goto :goto_15

    :cond_29
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->nestPurpose:Lco/bird/android/model/constant/NestPurpose;

    if-nez v1, :cond_2a

    move v1, v2

    goto :goto_16

    :cond_2a
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_16
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->privateBird:Lco/bird/android/model/wire/WirePrivateBird;

    if-nez v1, :cond_2b

    move v1, v2

    goto :goto_17

    :cond_2b
    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePrivateBird;->hashCode()I

    move-result v1

    :goto_17
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->scannedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_2c

    move v1, v2

    goto :goto_18

    :cond_2c
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_18
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->bountyReasons:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->isScanlessRideEligible:Z

    if-eqz v1, :cond_2d

    move v1, v3

    :cond_2d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->ephemeralId:Ljava/lang/String;

    if-nez v1, :cond_2e

    move v1, v2

    goto :goto_19

    :cond_2e
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_19
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireBird;->hasHelmet:Z

    if-eqz v1, :cond_2f

    goto :goto_1a

    :cond_2f
    move v3, v1

    :goto_1a
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_30

    move v1, v2

    goto :goto_1b

    :cond_30
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_1b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->bleMacAddress:Ljava/lang/String;

    if-nez v1, :cond_31

    move v1, v2

    goto :goto_1c

    :cond_31
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->cellId:Ljava/lang/String;

    if-nez v1, :cond_32

    move v1, v2

    goto :goto_1d

    :cond_32
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBird;->externalFeedType:Ljava/lang/String;

    if-nez v1, :cond_33

    goto :goto_1e

    :cond_33
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1e
    add-int/2addr v0, v2

    return v0
.end method

.method public final isProbablySame(Lco/bird/android/model/wire/WireBird;)Z
    .locals 4

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireBird$isProbablySame$idMatches$2;

    invoke-direct {v0, p0, p1}, Lco/bird/android/model/wire/WireBird$isProbablySame$idMatches$2;-><init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/WireBird;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/wire/WireBird$isProbablySame$codeMatches$2;

    invoke-direct {v1, p0, p1}, Lco/bird/android/model/wire/WireBird$isProbablySame$codeMatches$2;-><init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/WireBird;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    new-instance v2, Lco/bird/android/model/wire/WireBird$isProbablySame$serialMatches$2;

    invoke-direct {v2, p0, p1}, Lco/bird/android/model/wire/WireBird$isProbablySame$serialMatches$2;-><init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/WireBird;)V

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    new-instance v3, Lco/bird/android/model/wire/WireBird$isProbablySame$imeiMatches$2;

    invoke-direct {v3, p0, p1}, Lco/bird/android/model/wire/WireBird$isProbablySame$imeiMatches$2;-><init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/WireBird;)V

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    invoke-static {v0}, Lco/bird/android/model/wire/WireBird;->isProbablySame$lambda$0(Lkotlin/Lazy;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v1}, Lco/bird/android/model/wire/WireBird;->isProbablySame$lambda$1(Lkotlin/Lazy;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v2}, Lco/bird/android/model/wire/WireBird;->isProbablySame$lambda$2(Lkotlin/Lazy;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lco/bird/android/model/wire/WireBird;->isProbablySame$lambda$3(Lkotlin/Lazy;)Z

    move-result p1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final isSame(Lco/bird/android/model/wire/WireBird;)Z
    .locals 4

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->id:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_4

    iget-object v0, p1, Lco/bird/android/model/wire/WireBird;->id:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    if-eqz v0, :cond_4

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->id:Ljava/lang/String;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBird;->ephemeralId:Ljava/lang/String;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->ephemeralId:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/wire/WireBird;->id:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :cond_3
    :goto_2
    return v1

    :cond_4
    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->code:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_5

    move v0, v1

    goto :goto_3

    :cond_5
    move v0, v2

    :goto_3
    if-eqz v0, :cond_7

    iget-object v0, p1, Lco/bird/android/model/wire/WireBird;->code:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_6

    move v0, v1

    goto :goto_4

    :cond_6
    move v0, v2

    :goto_4
    if-eqz v0, :cond_7

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->code:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/wire/WireBird;->code:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_7
    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->serialNumber:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_8

    move v0, v1

    goto :goto_5

    :cond_8
    move v0, v2

    :goto_5
    if-eqz v0, :cond_a

    iget-object v0, p1, Lco/bird/android/model/wire/WireBird;->serialNumber:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_9

    goto :goto_6

    :cond_9
    move v1, v2

    :goto_6
    if-eqz v1, :cond_a

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->serialNumber:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/wire/WireBird;->serialNumber:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_a
    return v2
.end method

.method public final isScanlessRideEligible()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->isScanlessRideEligible:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 33

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/model/wire/WireBird;->id:Ljava/lang/String;

    iget-object v2, v0, Lco/bird/android/model/wire/WireBird;->code:Ljava/lang/String;

    iget-object v3, v0, Lco/bird/android/model/wire/WireBird;->model:Ljava/lang/String;

    iget v4, v0, Lco/bird/android/model/wire/WireBird;->batteryLevel:I

    iget-object v5, v0, Lco/bird/android/model/wire/WireBird;->estimatedRange:Ljava/lang/Integer;

    iget v6, v0, Lco/bird/android/model/wire/WireBird;->distance:I

    iget-object v7, v0, Lco/bird/android/model/wire/WireBird;->location:Lco/bird/android/model/wire/WireLocation;

    iget-object v8, v0, Lco/bird/android/model/wire/WireBird;->stickerId:Ljava/lang/String;

    iget-object v9, v0, Lco/bird/android/model/wire/WireBird;->serialNumber:Ljava/lang/String;

    iget-object v10, v0, Lco/bird/android/model/wire/WireBird;->gpsAt:Lorg/joda/time/DateTime;

    iget-object v11, v0, Lco/bird/android/model/wire/WireBird;->trackedAt:Lorg/joda/time/DateTime;

    iget-boolean v12, v0, Lco/bird/android/model/wire/WireBird;->bluetooth:Z

    iget-boolean v13, v0, Lco/bird/android/model/wire/WireBird;->cellular:Z

    iget-boolean v14, v0, Lco/bird/android/model/wire/WireBird;->locked:Z

    iget-boolean v15, v0, Lco/bird/android/model/wire/WireBird;->ackLocked:Z

    move/from16 v16, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->physicalLock:Lco/bird/android/model/wire/WirePhysicalLock;

    move-object/from16 v17, v15

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getPhysicalLocks()Ljava/util/List;

    move-result-object v15

    move-object/from16 v18, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/WireBird;->down:Z

    move/from16 v19, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->partnerId:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->nestId:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    move-object/from16 v22, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->lifecycle:Lco/bird/android/model/wire/WireLifecycle;

    move-object/from16 v23, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->areaKey:Ljava/lang/String;

    move-object/from16 v24, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->privateBird:Lco/bird/android/model/wire/WirePrivateBird;

    move-object/from16 v25, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->scannedAt:Lorg/joda/time/DateTime;

    move-object/from16 v26, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    move-object/from16 v27, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->ephemeralId:Ljava/lang/String;

    move-object/from16 v28, v15

    iget-boolean v15, v0, Lco/bird/android/model/wire/WireBird;->hasHelmet:Z

    move/from16 v29, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    move-object/from16 v30, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->bleMacAddress:Ljava/lang/String;

    move-object/from16 v31, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireBird;->externalFeedType:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v32, v15

    const-string v15, "WireBird(id="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", model="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", batteryLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", estimatedRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", location="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stickerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", serialNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", gpsAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trackedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bluetooth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cellular="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", locked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", ackLocked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", physicalLock="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", physicalLocks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", down="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", partnerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", nestId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", lastRideEndedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lifecycle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", areaKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", privateBird="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scannedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", badgeType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ephemeralId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hasHelmet="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", locationUpdatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bleMacAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", externalFeedType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->model:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->taskId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lco/bird/android/model/wire/WireBird;->batteryLevel:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->estimatedRange:Ljava/lang/Integer;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_0
    iget v0, p0, Lco/bird/android/model/wire/WireBird;->distance:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->location:Lco/bird/android/model/wire/WireLocation;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WireLocation;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->code:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->stickerId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->serialNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->disconnected:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->collect:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->submerged:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->lost:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->locked:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->ackLocked:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->captive:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->gpsFix:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->broken:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->label:Lco/bird/android/model/wire/WireBirdLabel;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WireBirdLabel;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->actions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/constant/BirdAction;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bountyId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bountyPrice:Ljava/lang/Integer;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_2
    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bountyCurrency:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->bountyLost:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->bountyOverdue:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bountyKind:Lco/bird/android/model/constant/BountyKind;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->brandName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->taskKind:Lco/bird/android/model/constant/BirdTaskKind;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->gpsAt:Lorg/joda/time/DateTime;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->trackedAt:Lorg/joda/time/DateTime;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->token:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->bluetooth:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->cellular:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->startedAt:Lorg/joda/time/DateTime;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->dueAt:Lorg/joda/time/DateTime;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->asleep:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->imei:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->boardProtocol:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->physicalLock:Lco/bird/android/model/wire/WirePhysicalLock;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WirePhysicalLock;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->priorityCollect:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->down:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->needsInspection:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->partnerId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->nestId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->lastRideEndedAt:Lorg/joda/time/DateTime;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->partnerBirdState:Lco/bird/android/model/constant/PartnerBirdState;

    if-nez v0, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_4
    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->peril:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->deliverable:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->lifecycle:Lco/bird/android/model/wire/WireLifecycle;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WireLifecycle;->writeToParcel(Landroid/os/Parcel;I)V

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireBird;->offline:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->license:Lco/bird/android/model/wire/WireBirdLicenseView;

    if-nez v0, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WireBirdLicenseView;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_5
    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->areaKey:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->fleetId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->nestPurpose:Lco/bird/android/model/constant/NestPurpose;

    if-nez v0, :cond_6

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_6
    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->privateBird:Lco/bird/android/model/wire/WirePrivateBird;

    if-nez v0, :cond_7

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WirePrivateBird;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_7
    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->scannedAt:Lorg/joda/time/DateTime;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->badgeType:Lco/bird/android/model/constant/MapPinBadge;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireBird;->bountyReasons:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireBountyReason;

    invoke-virtual {v1, p1, p2}, Lco/bird/android/model/wire/WireBountyReason;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_8

    :cond_8
    iget-boolean p2, p0, Lco/bird/android/model/wire/WireBird;->isScanlessRideEligible:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lco/bird/android/model/wire/WireBird;->ephemeralId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lco/bird/android/model/wire/WireBird;->hasHelmet:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lco/bird/android/model/wire/WireBird;->locationUpdatedAt:Lorg/joda/time/DateTime;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object p2, p0, Lco/bird/android/model/wire/WireBird;->bleMacAddress:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/model/wire/WireBird;->cellId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/model/wire/WireBird;->externalFeedType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
