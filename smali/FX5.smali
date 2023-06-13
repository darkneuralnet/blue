.class public final synthetic LFX5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:LJX5;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Llb0;

.field public final synthetic d:Ltv5;


# direct methods
.method public synthetic constructor <init>(LJX5;Ljava/util/List;Llb0;Ltv5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFX5;->a:LJX5;

    iput-object p2, p0, LFX5;->b:Ljava/util/List;

    iput-object p3, p0, LFX5;->c:Llb0;

    iput-object p4, p0, LFX5;->d:Ltv5;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LFX5;->a:LJX5;

    iget-object v1, p0, LFX5;->b:Ljava/util/List;

    iget-object v2, p0, LFX5;->c:Llb0;

    iget-object v3, p0, LFX5;->d:Ltv5;

    invoke-static {v0, v1, v2, v3, p1}, LJX5;->v(LJX5;Ljava/util/List;Llb0;Ltv5;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
