.class public final synthetic LyR7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk69;


# instance fields
.field public final synthetic a:LdS7;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LdS7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LyR7;->a:LdS7;

    iput-object p2, p0, LyR7;->b:Ljava/lang/String;

    iput-object p3, p0, LyR7;->c:Ljava/lang/String;

    iput-object p4, p0, LyR7;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)LMb9;
    .locals 4

    iget-object v0, p0, LyR7;->a:LdS7;

    iget-object v1, p0, LyR7;->b:Ljava/lang/String;

    iget-object v2, p0, LyR7;->c:Ljava/lang/String;

    iget-object v3, p0, LyR7;->d:Ljava/lang/String;

    check-cast p1, Lz18;

    invoke-virtual {v0, v1, v2, v3, p1}, LdS7;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lz18;)LMb9;

    move-result-object p1

    return-object p1
.end method
