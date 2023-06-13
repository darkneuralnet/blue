.class public final synthetic LDm1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# instance fields
.field public final synthetic a:Lyb4;

.field public final synthetic b:Lyb4;


# direct methods
.method public synthetic constructor <init>(Lyb4;Lyb4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDm1;->a:Lyb4;

    iput-object p2, p0, LDm1;->b:Lyb4;

    return-void
.end method


# virtual methods
.method public final a(LOs0;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LDm1;->a:Lyb4;

    iget-object v1, p0, LDm1;->b:Lyb4;

    invoke-static {v0, v1, p1}, Lcom/google/firebase/appcheck/playintegrity/FirebaseAppCheckPlayIntegrityRegistrar;->a(Lyb4;Lyb4;LOs0;)LxW3;

    move-result-object p1

    return-object p1
.end method
