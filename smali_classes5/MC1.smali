.class public final LMC1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMC1$b;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LMC1$b;)LMC1$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LMC1$b<",
            "TT;>;)",
            "LMC1$b<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LMC1$a;

    invoke-direct {v0, p0}, LMC1$a;-><init>(LMC1$b;)V

    return-object v0
.end method
