.class public final Lxa1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lya1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lxa1;",
        "Lya1;",
        "b",
        "Lya1;",
        "delegate",
        "LsP5;",
        "",
        "a",
        "()LsP5;",
        "fontLoaded",
        "<init>",
        "()V",
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
.field public static final a:Lxa1;

.field public static b:Lya1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxa1;

    invoke-direct {v0}, Lxa1;-><init>()V

    sput-object v0, Lxa1;->a:Lxa1;

    new-instance v0, LwX0;

    invoke-direct {v0}, LwX0;-><init>()V

    sput-object v0, Lxa1;->b:Lya1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LsP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    sget-object v0, Lxa1;->b:Lya1;

    invoke-interface {v0}, Lya1;->a()LsP5;

    move-result-object v0

    return-object v0
.end method
