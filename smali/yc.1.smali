.class public final Lyc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRp5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ)\u0010\u0008\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000c"
    }
    d2 = {
        "Lyc;",
        "LRp5;",
        "Lg01;",
        "LYW3;",
        "event",
        "LG52;",
        "bounds",
        "LCe3;",
        "a",
        "(Lg01;LYW3;J)J",
        "<init>",
        "()V",
        "foundation_release"
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
        "SMAP\nAndroidScrollable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,35:1\n59#2,3:36\n62#2,2:43\n64#2:46\n33#3,4:39\n38#3:45\n154#4:47\n*S KotlinDebug\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n*L\n33#1:36,3\n33#1:43,2\n33#1:46\n33#1:39,4\n33#1:45\n33#1:47\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lyc;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lyc;

    invoke-direct {v0}, Lyc;-><init>()V

    sput-object v0, Lyc;->a:Lyc;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lg01;LYW3;J)J
    .locals 6

    const-string p3, "$this$calculateMouseWheelScroll"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "event"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LYW3;->c()Ljava/util/List;

    move-result-object p2

    sget-object p3, LCe3;->b:LCe3$a;

    invoke-virtual {p3}, LCe3$a;->c()J

    move-result-wide p3

    invoke-static {p3, p4}, LCe3;->d(J)LCe3;

    move-result-object p3

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p4

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p4, :cond_0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LjX3;

    invoke-virtual {p3}, LCe3;->x()J

    move-result-wide v2

    invoke-virtual {v1}, LjX3;->k()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LCe3;->t(JJ)J

    move-result-wide v1

    invoke-static {v1, v2}, LCe3;->d(J)LCe3;

    move-result-object p3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, LCe3;->x()J

    move-result-wide p2

    const/16 p4, 0x40

    int-to-float p4, p4

    invoke-static {p4}, Lk61;->g(F)F

    move-result p4

    invoke-interface {p1, p4}, Lg01;->T0(F)F

    move-result p1

    neg-float p1, p1

    invoke-static {p2, p3, p1}, LCe3;->u(JF)J

    move-result-wide p1

    return-wide p1
.end method
