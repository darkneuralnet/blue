.class public final Lqv8;
.super Lmj8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lmj8<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final a:Lqv8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqv8;

    invoke-direct {v0}, Lqv8;-><init>()V

    sput-object v0, Lqv8;->a:Lqv8;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lmj8;-><init>()V

    return-void
.end method

.method public static final a()Lqv8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lqv8<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lqv8;->a:Lqv8;

    return-object v0
.end method
