.class public final synthetic LcN7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYH8;


# instance fields
.field public final synthetic a:LmO7;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LmO7;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LcN7;->a:LmO7;

    iput-object p2, p0, LcN7;->b:Ljava/lang/String;

    iput-object p3, p0, LcN7;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LcN7;->a:LmO7;

    iget-object v1, p0, LcN7;->b:Ljava/lang/String;

    iget-object v2, p0, LcN7;->c:Ljava/lang/String;

    check-cast p1, Lwt9;

    invoke-virtual {v0, v1, v2, p1}, LmO7;->b(Ljava/lang/String;Ljava/lang/String;Lwt9;)Lq28;

    move-result-object p1

    return-object p1
.end method
