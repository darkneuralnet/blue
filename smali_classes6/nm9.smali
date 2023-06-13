.class public abstract Lnm9;
.super LEm9;
.source "SourceFile"

# interfaces
.implements LPp9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lnm9<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "LEm9<",
        "TMessageType;TBuilderType;>;",
        "LPp9;"
    }
.end annotation


# instance fields
.field protected final zzb:LVk9;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LEm9;-><init>()V

    invoke-static {}, LVk9;->b()LVk9;

    move-result-object v0

    iput-object v0, p0, Lnm9;->zzb:LVk9;

    return-void
.end method
