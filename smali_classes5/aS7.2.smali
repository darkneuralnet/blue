.class public final synthetic LaS7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LyT7;


# instance fields
.field public final synthetic a:LES7;


# direct methods
.method public synthetic constructor <init>(LES7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LaS7;->a:LES7;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LaS7;->a:LES7;

    invoke-virtual {v0}, LES7;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
