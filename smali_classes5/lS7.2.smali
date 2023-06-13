.class public final LlS7;
.super LFM7;
.source "SourceFile"


# instance fields
.field public final transient d:LoM7;

.field public final transient e:LHL7;


# direct methods
.method public constructor <init>(LoM7;LHL7;)V
    .locals 0

    invoke-direct {p0}, LFM7;-><init>()V

    iput-object p1, p0, LlS7;->d:LoM7;

    iput-object p2, p0, LlS7;->e:LHL7;

    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;I)I
    .locals 1

    iget-object p2, p0, LlS7;->e:LHL7;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, LBJ7;->a([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LlS7;->d:LoM7;

    invoke-virtual {v0, p1}, LoM7;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final e()LST7;
    .locals 2

    iget-object v0, p0, LlS7;->e:LHL7;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LHL7;->u(I)LhU7;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, LlS7;->e:LHL7;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LHL7;->u(I)LhU7;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LlS7;->d:LoM7;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
