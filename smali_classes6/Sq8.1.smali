.class public final synthetic LSq8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk69;


# instance fields
.field public final synthetic a:LOs8;


# direct methods
.method public synthetic constructor <init>(LOs8;LNt8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSq8;->a:LOs8;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)LMb9;
    .locals 2

    iget-object v0, p0, LSq8;->a:LOs8;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, LOs8;->e(LNt8;Ljava/lang/Object;)LMb9;

    move-result-object p1

    return-object p1
.end method
