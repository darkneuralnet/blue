.class public final synthetic LCm1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# instance fields
.field public final synthetic a:Lyb4;

.field public final synthetic b:Lyb4;

.field public final synthetic c:Lyb4;


# direct methods
.method public synthetic constructor <init>(Lyb4;Lyb4;Lyb4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCm1;->a:Lyb4;

    iput-object p2, p0, LCm1;->b:Lyb4;

    iput-object p3, p0, LCm1;->c:Lyb4;

    return-void
.end method


# virtual methods
.method public final a(LOs0;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LCm1;->a:Lyb4;

    iget-object v1, p0, LCm1;->b:Lyb4;

    iget-object v2, p0, LCm1;->c:Lyb4;

    invoke-static {v0, v1, v2, p1}, Lcom/google/firebase/appcheck/debug/FirebaseAppCheckDebugRegistrar;->a(Lyb4;Lyb4;Lyb4;LOs0;)LKU0;

    move-result-object p1

    return-object p1
.end method
