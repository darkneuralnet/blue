.class public final Lom1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Llm1;

.field public final b:Llm1;

.field public final c:Llm1;


# direct methods
.method public constructor <init>([Llm1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    aget-object v0, p1, v0

    iput-object v0, p0, Lom1;->a:Llm1;

    const/4 v0, 0x1

    aget-object v0, p1, v0

    iput-object v0, p0, Lom1;->b:Llm1;

    const/4 v0, 0x2

    aget-object p1, p1, v0

    iput-object p1, p0, Lom1;->c:Llm1;

    return-void
.end method


# virtual methods
.method public a()Llm1;
    .locals 1

    iget-object v0, p0, Lom1;->a:Llm1;

    return-object v0
.end method

.method public b()Llm1;
    .locals 1

    iget-object v0, p0, Lom1;->b:Llm1;

    return-object v0
.end method

.method public c()Llm1;
    .locals 1

    iget-object v0, p0, Lom1;->c:Llm1;

    return-object v0
.end method
