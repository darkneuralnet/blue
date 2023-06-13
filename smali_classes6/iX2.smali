.class public abstract LiX2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LiX2$d;,
        LiX2$c;,
        LiX2$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K0:",
        "Ljava/lang/Object;",
        "V0:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LhX2;)V
    .locals 0

    invoke-direct {p0}, LiX2;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Class;)LiX2$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K0:",
            "Ljava/lang/Enum<",
            "TK0;>;>(",
            "Ljava/lang/Class<",
            "TK0;>;)",
            "LiX2$c<",
            "TK0;>;"
        }
    .end annotation

    invoke-static {p0}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LiX2$a;

    invoke-direct {v0, p0}, LiX2$a;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method
