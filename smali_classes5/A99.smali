.class public abstract LA99;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lorg/jspecify/nullness/NullMarked;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(C)LA99;
    .locals 1

    new-instance v0, LPT8;

    invoke-direct {v0, p0}, LPT8;-><init>(C)V

    return-object v0
.end method


# virtual methods
.method public abstract a(C)Z
.end method
