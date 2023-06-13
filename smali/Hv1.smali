.class public final synthetic LHv1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LLv1;

.field public final synthetic c:LO80$a;

.field public final synthetic d:LCv1;

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(LLv1;LO80$a;LCv1;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHv1;->b:LLv1;

    iput-object p2, p0, LHv1;->c:LO80$a;

    iput-object p3, p0, LHv1;->d:LCv1;

    iput-wide p4, p0, LHv1;->e:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LHv1;->b:LLv1;

    iget-object v1, p0, LHv1;->c:LO80$a;

    iget-object v2, p0, LHv1;->d:LCv1;

    iget-wide v3, p0, LHv1;->e:J

    invoke-static {v0, v1, v2, v3, v4}, LLv1;->f(LLv1;LO80$a;LCv1;J)V

    return-void
.end method
