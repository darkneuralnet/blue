.class public final synthetic Ln90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:Lr90;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lr90;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln90;->a:Lr90;

    iput-wide p2, p0, Ln90;->b:J

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ln90;->a:Lr90;

    iget-wide v1, p0, Ln90;->b:J

    invoke-static {v0, v1, v2, p1}, Lr90;->s(Lr90;JLO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
