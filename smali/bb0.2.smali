.class public Lbb0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbb0$a;
    }
.end annotation


# static fields
.field public static final a:Landroidx/camera/core/impl/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbb0$a;

    invoke-direct {v0}, Lbb0$a;-><init>()V

    sput-object v0, Lbb0;->a:Landroidx/camera/core/impl/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Landroidx/camera/core/impl/c;
    .locals 1

    sget-object v0, Lbb0;->a:Landroidx/camera/core/impl/c;

    return-object v0
.end method
