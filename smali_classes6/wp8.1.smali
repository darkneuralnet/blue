.class public final synthetic Lwp8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk69;


# instance fields
.field public final synthetic a:Lqq8;

.field public final synthetic b:LMb9;


# direct methods
.method public synthetic constructor <init>(Lqq8;LMb9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwp8;->a:Lqq8;

    iput-object p2, p0, Lwp8;->b:LMb9;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)LMb9;
    .locals 2

    iget-object v0, p0, Lwp8;->a:Lqq8;

    iget-object v1, p0, Lwp8;->b:LMb9;

    invoke-virtual {v0, v1, p1}, Lqq8;->k(LMb9;Ljava/lang/Object;)LMb9;

    move-result-object p1

    return-object p1
.end method
