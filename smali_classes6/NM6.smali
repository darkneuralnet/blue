.class public final LNM6;
.super LtM6;
.source "SourceFile"


# instance fields
.field public final c:I

.field public final d:J

.field public final e:I

.field public final f:J

.field public final g:I

.field public final h:Ljava/lang/String;

.field public final i:J

.field public final j:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(ILjava/lang/String;IJIJILjava/lang/String;JLjava/io/InputStream;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LtM6;-><init>(ILjava/lang/String;)V

    iput p3, p0, LNM6;->c:I

    iput-wide p4, p0, LNM6;->d:J

    iput p6, p0, LNM6;->e:I

    iput-wide p7, p0, LNM6;->f:J

    iput p9, p0, LNM6;->g:I

    iput-object p10, p0, LNM6;->h:Ljava/lang/String;

    iput-wide p11, p0, LNM6;->i:J

    iput-object p13, p0, LNM6;->j:Ljava/io/InputStream;

    return-void
.end method
