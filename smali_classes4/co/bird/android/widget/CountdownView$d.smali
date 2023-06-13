.class public final enum Lco/bird/android/widget/CountdownView$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/widget/CountdownView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/widget/CountdownView$d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\u0008\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/android/widget/CountdownView$d;",
        "",
        "Landroid/text/style/StyleSpan;",
        "b",
        "Landroid/text/style/StyleSpan;",
        "()Landroid/text/style/StyleSpan;",
        "styleSpan",
        "<init>",
        "(Ljava/lang/String;ILandroid/text/style/StyleSpan;)V",
        "c",
        "d",
        "e",
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
.field public static final enum c:Lco/bird/android/widget/CountdownView$d;

.field public static final enum d:Lco/bird/android/widget/CountdownView$d;

.field public static final enum e:Lco/bird/android/widget/CountdownView$d;

.field public static final synthetic f:[Lco/bird/android/widget/CountdownView$d;


# instance fields
.field public final b:Landroid/text/style/StyleSpan;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lco/bird/android/widget/CountdownView$d;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "NORMAL"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/widget/CountdownView$d;-><init>(Ljava/lang/String;ILandroid/text/style/StyleSpan;)V

    sput-object v0, Lco/bird/android/widget/CountdownView$d;->c:Lco/bird/android/widget/CountdownView$d;

    new-instance v0, Lco/bird/android/widget/CountdownView$d;

    new-instance v1, Landroid/text/style/StyleSpan;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/text/style/StyleSpan;-><init>(I)V

    const-string v3, "BOLD"

    invoke-direct {v0, v3, v2, v1}, Lco/bird/android/widget/CountdownView$d;-><init>(Ljava/lang/String;ILandroid/text/style/StyleSpan;)V

    sput-object v0, Lco/bird/android/widget/CountdownView$d;->d:Lco/bird/android/widget/CountdownView$d;

    new-instance v0, Lco/bird/android/widget/CountdownView$d;

    new-instance v1, Landroid/text/style/StyleSpan;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Landroid/text/style/StyleSpan;-><init>(I)V

    const-string v3, "ITALIC"

    invoke-direct {v0, v3, v2, v1}, Lco/bird/android/widget/CountdownView$d;-><init>(Ljava/lang/String;ILandroid/text/style/StyleSpan;)V

    sput-object v0, Lco/bird/android/widget/CountdownView$d;->e:Lco/bird/android/widget/CountdownView$d;

    invoke-static {}, Lco/bird/android/widget/CountdownView$d;->a()[Lco/bird/android/widget/CountdownView$d;

    move-result-object v0

    sput-object v0, Lco/bird/android/widget/CountdownView$d;->f:[Lco/bird/android/widget/CountdownView$d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILandroid/text/style/StyleSpan;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/text/style/StyleSpan;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lco/bird/android/widget/CountdownView$d;->b:Landroid/text/style/StyleSpan;

    return-void
.end method

.method public static final synthetic a()[Lco/bird/android/widget/CountdownView$d;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lco/bird/android/widget/CountdownView$d;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/widget/CountdownView$d;->c:Lco/bird/android/widget/CountdownView$d;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/widget/CountdownView$d;->d:Lco/bird/android/widget/CountdownView$d;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/widget/CountdownView$d;->e:Lco/bird/android/widget/CountdownView$d;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/widget/CountdownView$d;
    .locals 1

    const-class v0, Lco/bird/android/widget/CountdownView$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/widget/CountdownView$d;

    return-object p0
.end method

.method public static values()[Lco/bird/android/widget/CountdownView$d;
    .locals 1

    sget-object v0, Lco/bird/android/widget/CountdownView$d;->f:[Lco/bird/android/widget/CountdownView$d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/widget/CountdownView$d;

    return-object v0
.end method


# virtual methods
.method public final b()Landroid/text/style/StyleSpan;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/CountdownView$d;->b:Landroid/text/style/StyleSpan;

    return-object v0
.end method
