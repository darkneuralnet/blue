.class public abstract LBb8;
.super LPb8;
.source "SourceFile"

# interfaces
.implements LYj8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "LBb8<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "LPb8<",
        "TMessageType;TBuilderType;>;",
        "LYj8;"
    }
.end annotation


# instance fields
.field protected final zzb:Lwa8;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LPb8;-><init>()V

    invoke-static {}, Lwa8;->a()Lwa8;

    move-result-object v0

    iput-object v0, p0, LBb8;->zzb:Lwa8;

    return-void
.end method
