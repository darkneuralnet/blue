.class public final Lqe0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\t\u0010\u0007R \u0010\u0008\u001a\u00020\u00028\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0004\u0012\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0003\u0010\u0005\u00a8\u0006\n"
    }
    d2 = {
        "Lqe0;",
        "",
        "Lac;",
        "a",
        "Lac;",
        "()Lac;",
        "getAndroidCanvas$annotations",
        "()V",
        "androidCanvas",
        "<init>",
        "ui-graphics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lac;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lac;

    invoke-direct {v0}, Lac;-><init>()V

    iput-object v0, p0, Lqe0;->a:Lac;

    return-void
.end method


# virtual methods
.method public final a()Lac;
    .locals 1

    iget-object v0, p0, Lqe0;->a:Lac;

    return-object v0
.end method
