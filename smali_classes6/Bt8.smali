.class public final synthetic LBt8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# static fields
.field public static final synthetic a:LBt8;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LBt8;

    invoke-direct {v0}, LBt8;-><init>()V

    sput-object v0, LBt8;->a:LBt8;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LOs0;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lcom/google/mlkit/vision/common/internal/a$d;

    const-class v1, Lmf7;

    invoke-interface {p1, v1}, LOs0;->d(Ljava/lang/Class;)LX94;

    move-result-object p1

    const-class v1, LMd3;

    invoke-direct {v0, v1, p1}, Lcom/google/mlkit/vision/common/internal/a$d;-><init>(Ljava/lang/Class;LX94;)V

    return-object v0
.end method
