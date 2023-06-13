.class public final LNK7;
.super LUH7;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, LUH7;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)LNK7;
    .locals 0

    invoke-super {p0, p1}, LUH7;->a(Ljava/lang/Object;)LUH7;

    return-object p0
.end method

.method public final d()LHL7;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LUH7;->c:Z

    iget-object v0, p0, LUH7;->a:[Ljava/lang/Object;

    iget v1, p0, LUH7;->b:I

    invoke-static {v0, v1}, LHL7;->o([Ljava/lang/Object;I)LHL7;

    move-result-object v0

    return-object v0
.end method
