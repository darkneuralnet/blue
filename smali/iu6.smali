.class public Liu6;
.super Lgu6;
.source "SourceFile"


# static fields
.field public static k:Z = true


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgu6;-><init>()V

    return-void
.end method


# virtual methods
.method public h(Landroid/view/View;I)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1, p2}, Lku6;->h(Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    sget-boolean v0, Liu6;->k:Z

    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {p1, p2}, Lhu6;->a(Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Liu6;->k:Z

    :cond_1
    :goto_0
    return-void
.end method
