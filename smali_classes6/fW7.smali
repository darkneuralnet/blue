.class public final LfW7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDV7;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x1a
.end annotation


# instance fields
.field public final a:LG29;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lw29;->a()LG29;

    move-result-object v0

    iput-object v0, p0, LfW7;->a:LG29;

    return-void
.end method


# virtual methods
.method public final zza()LKr9;
    .locals 1

    iget-object v0, p0, LfW7;->a:LG29;

    invoke-static {v0}, Lct9;->a(LG29;)LKr9;

    move-result-object v0

    return-object v0
.end method
