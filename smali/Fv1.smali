.class public final synthetic LFv1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:LLv1;

.field public final synthetic b:LCv1;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(LLv1;LCv1;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFv1;->a:LLv1;

    iput-object p2, p0, LFv1;->b:LCv1;

    iput-wide p3, p0, LFv1;->c:J

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LFv1;->a:LLv1;

    iget-object v1, p0, LFv1;->b:LCv1;

    iget-wide v2, p0, LFv1;->c:J

    invoke-static {v0, v1, v2, v3, p1}, LLv1;->d(LLv1;LCv1;JLO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
