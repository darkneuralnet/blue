.class public abstract LLP5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLP5$b;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LLP5$a;)V
    .locals 0

    invoke-direct {p0}, LLP5;-><init>()V

    return-void
.end method

.method public static a()LLP5;
    .locals 1

    new-instance v0, LLP5$b;

    invoke-direct {v0}, LLP5$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b(Z)V
.end method

.method public abstract c()V
.end method
