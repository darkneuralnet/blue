.class public final synthetic LEm1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# instance fields
.field public final synthetic a:Lyb4;

.field public final synthetic b:Lyb4;

.field public final synthetic c:Lyb4;

.field public final synthetic d:Lyb4;


# direct methods
.method public synthetic constructor <init>(Lyb4;Lyb4;Lyb4;Lyb4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEm1;->a:Lyb4;

    iput-object p2, p0, LEm1;->b:Lyb4;

    iput-object p3, p0, LEm1;->c:Lyb4;

    iput-object p4, p0, LEm1;->d:Lyb4;

    return-void
.end method


# virtual methods
.method public final a(LOs0;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LEm1;->a:Lyb4;

    iget-object v1, p0, LEm1;->b:Lyb4;

    iget-object v2, p0, LEm1;->c:Lyb4;

    iget-object v3, p0, LEm1;->d:Lyb4;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/google/firebase/appcheck/FirebaseAppCheckRegistrar;->a(Lyb4;Lyb4;Lyb4;Lyb4;LOs0;)LBm1;

    move-result-object p1

    return-object p1
.end method
