.class public final synthetic LCN6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOg3;


# static fields
.field public static final a:LOg3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LCN6;

    invoke-direct {v0}, LCN6;-><init>()V

    sput-object v0, LCN6;->a:LOg3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p1}, LcO6;->d(Ljava/lang/Exception;)V

    return-void
.end method
