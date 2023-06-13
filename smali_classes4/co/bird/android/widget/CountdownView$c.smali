.class public final enum Lco/bird/android/widget/CountdownView$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/widget/CountdownView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/widget/CountdownView$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\u0008\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/widget/CountdownView$c;",
        "",
        "LR46;",
        "b",
        "LR46;",
        "()LR46;",
        "timerState",
        "<init>",
        "(Ljava/lang/String;ILR46;)V",
        "c",
        "d",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum c:Lco/bird/android/widget/CountdownView$c;

.field public static final enum d:Lco/bird/android/widget/CountdownView$c;

.field public static final synthetic e:[Lco/bird/android/widget/CountdownView$c;


# instance fields
.field public final b:LR46;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lco/bird/android/widget/CountdownView$c;

    const/4 v1, 0x0

    sget-object v2, LR46;->e:LR46;

    const-string v3, "COUNT_DOWN"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/widget/CountdownView$c;-><init>(Ljava/lang/String;ILR46;)V

    sput-object v0, Lco/bird/android/widget/CountdownView$c;->c:Lco/bird/android/widget/CountdownView$c;

    new-instance v0, Lco/bird/android/widget/CountdownView$c;

    const/4 v1, 0x1

    sget-object v2, LR46;->d:LR46;

    const-string v3, "COUNT_UP"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/widget/CountdownView$c;-><init>(Ljava/lang/String;ILR46;)V

    sput-object v0, Lco/bird/android/widget/CountdownView$c;->d:Lco/bird/android/widget/CountdownView$c;

    invoke-static {}, Lco/bird/android/widget/CountdownView$c;->a()[Lco/bird/android/widget/CountdownView$c;

    move-result-object v0

    sput-object v0, Lco/bird/android/widget/CountdownView$c;->e:[Lco/bird/android/widget/CountdownView$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILR46;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR46;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lco/bird/android/widget/CountdownView$c;->b:LR46;

    return-void
.end method

.method public static final synthetic a()[Lco/bird/android/widget/CountdownView$c;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/widget/CountdownView$c;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/widget/CountdownView$c;->c:Lco/bird/android/widget/CountdownView$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/widget/CountdownView$c;->d:Lco/bird/android/widget/CountdownView$c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/widget/CountdownView$c;
    .locals 1

    const-class v0, Lco/bird/android/widget/CountdownView$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/widget/CountdownView$c;

    return-object p0
.end method

.method public static values()[Lco/bird/android/widget/CountdownView$c;
    .locals 1

    sget-object v0, Lco/bird/android/widget/CountdownView$c;->e:[Lco/bird/android/widget/CountdownView$c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/widget/CountdownView$c;

    return-object v0
.end method


# virtual methods
.method public final b()LR46;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/CountdownView$c;->b:LR46;

    return-object v0
.end method
