.class public final Lg4$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCk1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg4;->x(Landroid/app/Application;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "enabled",
        "",
        "a",
        "(Z)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lg4$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg4$d;

    invoke-direct {v0}, Lg4$d;-><init>()V

    sput-object v0, Lg4$d;->a:Lg4$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-static {}, LRl0;->h()V

    goto :goto_0

    :cond_0
    invoke-static {}, LRl0;->g()V

    :goto_0
    return-void
.end method
