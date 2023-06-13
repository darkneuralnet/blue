.class public abstract Le74$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le74;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(I)Le74$a;
    .locals 2

    new-instance v0, LXt;

    new-instance v1, Ls91;

    invoke-direct {v1}, Ls91;-><init>()V

    invoke-direct {v0, v1, p0}, LXt;-><init>(Ls91;I)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ls91;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls91<",
            "Le74$b;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b()I
.end method
