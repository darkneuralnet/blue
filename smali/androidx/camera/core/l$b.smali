.class public final Landroidx/camera/core/l$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Landroidx/camera/core/impl/o;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/camera/core/l$a;

    invoke-direct {v0}, Landroidx/camera/core/l$a;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroidx/camera/core/l$a;->h(I)Landroidx/camera/core/l$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/camera/core/l$a;->i(I)Landroidx/camera/core/l$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/l$a;->g()Landroidx/camera/core/impl/o;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/l$b;->a:Landroidx/camera/core/impl/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroidx/camera/core/impl/o;
    .locals 1

    sget-object v0, Landroidx/camera/core/l$b;->a:Landroidx/camera/core/impl/o;

    return-object v0
.end method
