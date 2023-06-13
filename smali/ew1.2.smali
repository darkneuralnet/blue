.class public interface abstract Lew1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lew1$a;,
        Lew1$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008g\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u001d\u0010\t\u001a\u00020\u00068&X\u00a6\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u001d\u0010\u000c\u001a\u00020\n8VX\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0008\u00f8\u0001\u0003\u0082\u0002\u0015\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\n\u0004\u0008!0\u0001\u00a8\u0006\r\u00c0\u0006\u0001"
    }
    d2 = {
        "Lew1;",
        "",
        "LJw1;",
        "b",
        "()LJw1;",
        "weight",
        "LEw1;",
        "c",
        "()I",
        "style",
        "Luw1;",
        "a",
        "loadingStrategy",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lew1$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lew1$a;->a:Lew1$a;

    sput-object v0, Lew1;->a:Lew1$a;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    sget-object v0, Luw1;->a:Luw1$a;

    invoke-virtual {v0}, Luw1$a;->b()I

    move-result v0

    return v0
.end method

.method public abstract b()LJw1;
.end method

.method public abstract c()I
.end method
