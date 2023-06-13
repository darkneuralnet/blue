.class public final synthetic Lnk8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk69;


# instance fields
.field public final synthetic a:LNj8;


# direct methods
.method public synthetic constructor <init>(LNj8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnk8;->a:LNj8;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)LMb9;
    .locals 1

    iget-object v0, p0, Lnk8;->a:LNj8;

    check-cast p1, LNp9;

    invoke-interface {v0}, LNj8;->zzc()LMb9;

    move-result-object p1

    return-object p1
.end method
