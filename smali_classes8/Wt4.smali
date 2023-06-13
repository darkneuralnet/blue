.class public LWt4;
.super LdC1;
.source "SourceFile"


# instance fields
.field public d:LTt4;


# direct methods
.method public constructor <init>(LWB1;LWB1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LdC1;-><init>(LWB1;LWB1;)V

    new-instance p1, LTt4;

    iget-object p2, p0, LdC1;->c:[LcC1;

    invoke-direct {p1, p2}, LTt4;-><init>([LcC1;)V

    iput-object p1, p0, LWt4;->d:LTt4;

    return-void
.end method

.method public static c(LWB1;LWB1;)LP62;
    .locals 1

    new-instance v0, LWt4;

    invoke-direct {v0, p0, p1}, LWt4;-><init>(LWB1;LWB1;)V

    invoke-virtual {v0}, LWt4;->b()LP62;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()LP62;
    .locals 1

    iget-object v0, p0, LWt4;->d:LTt4;

    invoke-virtual {v0}, LTt4;->b()LP62;

    move-result-object v0

    return-object v0
.end method
