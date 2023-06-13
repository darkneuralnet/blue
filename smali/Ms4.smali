.class public final LMs4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/inputmethod/InputConnection;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\r\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010!\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010d\u001a\u00020\u000c\u0012\u0006\u0010N\u001a\u00020J\u0012\u0006\u0010R\u001a\u00020\u0006\u00a2\u0006\u0004\u0008e\u0010fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u0007\u001a\u00020\u0006H\u0002J\u0008\u0010\u0008\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0008\u0010\u0011\u001a\u00020\u0006H\u0016J\u0008\u0010\u0012\u001a\u00020\u0006H\u0016J\u0008\u0010\u0013\u001a\u00020\u0004H\u0016J\u001a\u0010\u0017\u001a\u00020\u00062\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u001a\u0010\u001b\u001a\u00020\u00062\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0016J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0016J\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u0008\u0010!\u001a\u00020\u0006H\u0016J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010\'\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0016J\u0018\u0010(\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010\u00142\u0006\u0010&\u001a\u00020\tH\u0016J\u0010\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\tH\u0016J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010&\u001a\u00020\tH\u0016J\u0010\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020\tH\u0016J\u0010\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u00020\tH\u0016J\u0012\u00105\u001a\u00020\u00062\u0008\u0010\u0015\u001a\u0004\u0018\u000104H\u0016J\u0012\u00108\u001a\u00020\u00062\u0008\u00107\u001a\u0004\u0018\u000106H\u0016J\n\u0010:\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\tH\u0016J\u0010\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0016J\u0010\u0010@\u001a\u00020\t2\u0006\u0010?\u001a\u00020\tH\u0016J\u001c\u0010E\u001a\u00020\u00062\u0008\u0010B\u001a\u0004\u0018\u00010A2\u0008\u0010D\u001a\u0004\u0018\u00010CH\u0016J\"\u0010I\u001a\u00020\u00062\u0006\u0010G\u001a\u00020F2\u0006\u0010&\u001a\u00020\t2\u0008\u0010H\u001a\u0004\u0018\u00010CH\u0016R\u0017\u0010N\u001a\u00020J8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010K\u001a\u0004\u0008L\u0010MR\u0017\u0010R\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010O\u001a\u0004\u0008P\u0010QR\u0016\u0010T\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010SR*\u0010[\u001a\u00020\u000c2\u0006\u0010U\u001a\u00020\u000c8\u0000@@X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010V\u001a\u0004\u0008W\u0010X\"\u0004\u0008Y\u0010ZR\u0016\u0010\\\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Y\u0010SR\u0016\u0010]\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010OR\u001a\u0010a\u001a\u0008\u0012\u0004\u0012\u00020\u00020^8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008_\u0010`R\u0016\u0010c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008b\u0010O\u00a8\u0006g"
    }
    d2 = {
        "LMs4;",
        "Landroid/view/inputmethod/InputConnection;",
        "LN91;",
        "editCommand",
        "",
        "a",
        "",
        "b",
        "c",
        "",
        "code",
        "d",
        "LF16;",
        "state",
        "Lj32;",
        "inputMethodManager",
        "f",
        "beginBatchEdit",
        "endBatchEdit",
        "closeConnection",
        "",
        "text",
        "newCursorPosition",
        "commitText",
        "start",
        "end",
        "setComposingRegion",
        "setComposingText",
        "beforeLength",
        "afterLength",
        "deleteSurroundingTextInCodePoints",
        "deleteSurroundingText",
        "setSelection",
        "finishComposingText",
        "Landroid/view/KeyEvent;",
        "event",
        "sendKeyEvent",
        "maxChars",
        "flags",
        "getTextBeforeCursor",
        "getTextAfterCursor",
        "getSelectedText",
        "cursorUpdateMode",
        "requestCursorUpdates",
        "Landroid/view/inputmethod/ExtractedTextRequest;",
        "request",
        "Landroid/view/inputmethod/ExtractedText;",
        "getExtractedText",
        "id",
        "performContextMenuAction",
        "editorAction",
        "performEditorAction",
        "Landroid/view/inputmethod/CompletionInfo;",
        "commitCompletion",
        "Landroid/view/inputmethod/CorrectionInfo;",
        "correctionInfo",
        "commitCorrection",
        "Landroid/os/Handler;",
        "getHandler",
        "states",
        "clearMetaKeyStates",
        "enabled",
        "reportFullscreenMode",
        "reqModes",
        "getCursorCapsMode",
        "",
        "action",
        "Landroid/os/Bundle;",
        "data",
        "performPrivateCommand",
        "Landroid/view/inputmethod/InputContentInfo;",
        "inputContentInfo",
        "opts",
        "commitContent",
        "Ld32;",
        "Ld32;",
        "getEventCallback",
        "()Ld32;",
        "eventCallback",
        "Z",
        "getAutoCorrect",
        "()Z",
        "autoCorrect",
        "I",
        "batchDepth",
        "value",
        "LF16;",
        "getMTextFieldValue$ui_release",
        "()LF16;",
        "e",
        "(LF16;)V",
        "mTextFieldValue",
        "currentExtractedTextRequestToken",
        "extractedTextMonitorMode",
        "",
        "g",
        "Ljava/util/List;",
        "editCommands",
        "h",
        "isActive",
        "initState",
        "<init>",
        "(LF16;Ld32;Z)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n1#1,403:1\n80#1,5:404\n80#1,5:409\n80#1,5:414\n80#1,5:419\n80#1,5:424\n80#1,5:429\n80#1,5:434\n80#1,5:439\n80#1,5:444\n80#1,5:449\n80#1,5:454\n80#1,5:459\n80#1,5:464\n80#1,5:469\n80#1,5:474\n80#1,5:479\n80#1,5:484\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n139#1:404,5\n175#1:409,5\n180#1:414,5\n186#1:419,5\n194#1:424,5\n205#1:429,5\n211#1:434,5\n217#1:439,5\n223#1:444,5\n259#1:449,5\n295#1:454,5\n321#1:459,5\n344#1:464,5\n354#1:469,5\n366#1:474,5\n386#1:479,5\n395#1:484,5\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Ld32;

.field public final b:Z

.field public c:I

.field public d:LF16;

.field public e:I

.field public f:Z

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LN91;",
            ">;"
        }
    .end annotation
.end field

.field public h:Z


# direct methods
.method public constructor <init>(LF16;Ld32;Z)V
    .locals 1

    const-string v0, "initState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LMs4;->a:Ld32;

    iput-boolean p3, p0, LMs4;->b:Z

    iput-object p1, p0, LMs4;->d:LF16;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LMs4;->g:Ljava/util/List;

    const/4 p1, 0x1

    iput-boolean p1, p0, LMs4;->h:Z

    return-void
.end method


# virtual methods
.method public final a(LN91;)V
    .locals 1

    invoke-virtual {p0}, LMs4;->b()Z

    :try_start_0
    iget-object v0, p0, LMs4;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, LMs4;->c()Z

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, LMs4;->c()Z

    throw p1
.end method

.method public final b()Z
    .locals 2

    iget v0, p0, LMs4;->c:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LMs4;->c:I

    return v1
.end method

.method public beginBatchEdit()Z
    .locals 1

    iget-boolean v0, p0, LMs4;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LMs4;->b()Z

    move-result v0

    :cond_0
    return v0
.end method

.method public final c()Z
    .locals 3

    iget v0, p0, LMs4;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LMs4;->c:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, LMs4;->g:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, LMs4;->a:Ld32;

    iget-object v2, p0, LMs4;->g:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ld32;->d(Ljava/util/List;)V

    iget-object v0, p0, LMs4;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    iget v0, p0, LMs4;->c:I

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public clearMetaKeyStates(I)Z
    .locals 0

    iget-boolean p1, p0, LMs4;->h:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return p1
.end method

.method public closeConnection()V
    .locals 1

    iget-object v0, p0, LMs4;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    iput v0, p0, LMs4;->c:I

    iput-boolean v0, p0, LMs4;->h:Z

    iget-object v0, p0, LMs4;->a:Ld32;

    invoke-interface {v0, p0}, Ld32;->c(LMs4;)V

    return-void
.end method

.method public commitCompletion(Landroid/view/inputmethod/CompletionInfo;)Z
    .locals 0

    iget-boolean p1, p0, LMs4;->h:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return p1
.end method

.method public commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 0

    const-string p2, "inputContentInfo"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, LMs4;->h:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return p1
.end method

.method public commitCorrection(Landroid/view/inputmethod/CorrectionInfo;)Z
    .locals 0

    iget-boolean p1, p0, LMs4;->h:Z

    if-eqz p1, :cond_0

    iget-boolean p1, p0, LMs4;->b:Z

    :cond_0
    return p1
.end method

.method public commitText(Ljava/lang/CharSequence;I)Z
    .locals 2

    iget-boolean v0, p0, LMs4;->h:Z

    if-eqz v0, :cond_0

    new-instance v1, Lop0;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Lop0;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p0, v1}, LMs4;->a(LN91;)V

    :cond_0
    return v0
.end method

.method public final d(I)V
    .locals 2

    new-instance v0, Landroid/view/KeyEvent;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {p0, v0}, LMs4;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    new-instance v0, Landroid/view/KeyEvent;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {p0, v0}, LMs4;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    return-void
.end method

.method public deleteSurroundingText(II)Z
    .locals 1

    iget-boolean v0, p0, LMs4;->h:Z

    if-eqz v0, :cond_0

    new-instance v0, LYZ0;

    invoke-direct {v0, p1, p2}, LYZ0;-><init>(II)V

    invoke-virtual {p0, v0}, LMs4;->a(LN91;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public deleteSurroundingTextInCodePoints(II)Z
    .locals 1

    iget-boolean v0, p0, LMs4;->h:Z

    if-eqz v0, :cond_0

    new-instance v0, LZZ0;

    invoke-direct {v0, p1, p2}, LZZ0;-><init>(II)V

    invoke-virtual {p0, v0}, LMs4;->a(LN91;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final e(LF16;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LMs4;->d:LF16;

    return-void
.end method

.method public endBatchEdit()Z
    .locals 1

    invoke-virtual {p0}, LMs4;->c()Z

    move-result v0

    return v0
.end method

.method public final f(LF16;Lj32;)V
    .locals 5

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inputMethodManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LMs4;->h:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LMs4;->e(LF16;)V

    iget-boolean v0, p0, LMs4;->f:Z

    if-eqz v0, :cond_1

    iget v0, p0, LMs4;->e:I

    invoke-static {p1}, Lp32;->a(LF16;)Landroid/view/inputmethod/ExtractedText;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lj32;->d(ILandroid/view/inputmethod/ExtractedText;)V

    :cond_1
    invoke-virtual {p1}, LF16;->f()Ls26;

    move-result-object v0

    const/4 v1, -0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ls26;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, Ls26;->l(J)I

    move-result v0

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    invoke-virtual {p1}, LF16;->f()Ls26;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ls26;->r()J

    move-result-wide v1

    invoke-static {v1, v2}, Ls26;->k(J)I

    move-result v1

    :cond_3
    invoke-virtual {p1}, LF16;->g()J

    move-result-wide v2

    invoke-static {v2, v3}, Ls26;->l(J)I

    move-result v2

    invoke-virtual {p1}, LF16;->g()J

    move-result-wide v3

    invoke-static {v3, v4}, Ls26;->k(J)I

    move-result p1

    invoke-interface {p2, v2, p1, v0, v1}, Lj32;->a(IIII)V

    return-void
.end method

.method public finishComposingText()Z
    .locals 1

    iget-boolean v0, p0, LMs4;->h:Z

    if-eqz v0, :cond_0

    new-instance v0, Lpm1;

    invoke-direct {v0}, Lpm1;-><init>()V

    invoke-virtual {p0, v0}, LMs4;->a(LN91;)V

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public getCursorCapsMode(I)I
    .locals 3

    iget-object v0, p0, LMs4;->d:LF16;

    invoke-virtual {v0}, LF16;->h()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LMs4;->d:LF16;

    invoke-virtual {v1}, LF16;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ls26;->l(J)I

    move-result v1

    invoke-static {v0, v1, p1}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result p1

    return p1
.end method

.method public getExtractedText(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;
    .locals 2

    const/4 v0, 0x1

    and-int/2addr p2, v0

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, LMs4;->f:Z

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    iget v1, p1, Landroid/view/inputmethod/ExtractedTextRequest;->token:I

    :cond_1
    iput v1, p0, LMs4;->e:I

    :cond_2
    iget-object p1, p0, LMs4;->d:LF16;

    invoke-static {p1}, Lp32;->a(LF16;)Landroid/view/inputmethod/ExtractedText;

    move-result-object p1

    return-object p1
.end method

.method public getHandler()Landroid/os/Handler;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSelectedText(I)Ljava/lang/CharSequence;
    .locals 2

    iget-object p1, p0, LMs4;->d:LF16;

    invoke-virtual {p1}, LF16;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Ls26;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LMs4;->d:LF16;

    invoke-static {p1}, LG16;->a(LF16;)LDf;

    move-result-object p1

    invoke-virtual {p1}, LDf;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public getTextAfterCursor(II)Ljava/lang/CharSequence;
    .locals 0

    iget-object p2, p0, LMs4;->d:LF16;

    invoke-static {p2, p1}, LG16;->b(LF16;I)LDf;

    move-result-object p1

    invoke-virtual {p1}, LDf;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getTextBeforeCursor(II)Ljava/lang/CharSequence;
    .locals 0

    iget-object p2, p0, LMs4;->d:LF16;

    invoke-static {p2, p1}, LG16;->c(LF16;I)LDf;

    move-result-object p1

    invoke-virtual {p1}, LDf;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public performContextMenuAction(I)Z
    .locals 2

    iget-boolean v0, p0, LMs4;->h:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/16 p1, 0x117

    invoke-virtual {p0, p1}, LMs4;->d(I)V

    goto :goto_0

    :pswitch_1
    const/16 p1, 0x116

    invoke-virtual {p0, p1}, LMs4;->d(I)V

    goto :goto_0

    :pswitch_2
    const/16 p1, 0x115

    invoke-virtual {p0, p1}, LMs4;->d(I)V

    goto :goto_0

    :pswitch_3
    new-instance p1, Law5;

    iget-object v1, p0, LMs4;->d:LF16;

    invoke-virtual {v1}, LF16;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {p1, v0, v1}, Law5;-><init>(II)V

    invoke-virtual {p0, p1}, LMs4;->a(LN91;)V

    :cond_0
    :goto_0
    return v0

    :pswitch_data_0
    .packed-switch 0x102001f
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public performEditorAction(I)Z
    .locals 2

    iget-boolean v0, p0, LMs4;->h:Z

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    packed-switch p1, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IME sends unsupported Editor Action: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RecordingIC"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, LFY1;->b:LFY1$a;

    invoke-virtual {p1}, LFY1$a;->a()I

    move-result p1

    goto :goto_0

    :pswitch_0
    sget-object p1, LFY1;->b:LFY1$a;

    invoke-virtual {p1}, LFY1$a;->f()I

    move-result p1

    goto :goto_0

    :pswitch_1
    sget-object p1, LFY1;->b:LFY1$a;

    invoke-virtual {p1}, LFY1$a;->b()I

    move-result p1

    goto :goto_0

    :pswitch_2
    sget-object p1, LFY1;->b:LFY1$a;

    invoke-virtual {p1}, LFY1$a;->d()I

    move-result p1

    goto :goto_0

    :pswitch_3
    sget-object p1, LFY1;->b:LFY1$a;

    invoke-virtual {p1}, LFY1$a;->h()I

    move-result p1

    goto :goto_0

    :pswitch_4
    sget-object p1, LFY1;->b:LFY1$a;

    invoke-virtual {p1}, LFY1$a;->g()I

    move-result p1

    goto :goto_0

    :pswitch_5
    sget-object p1, LFY1;->b:LFY1$a;

    invoke-virtual {p1}, LFY1$a;->c()I

    move-result p1

    goto :goto_0

    :cond_0
    sget-object p1, LFY1;->b:LFY1$a;

    invoke-virtual {p1}, LFY1$a;->a()I

    move-result p1

    :goto_0
    iget-object v0, p0, LMs4;->a:Ld32;

    invoke-interface {v0, p1}, Ld32;->b(I)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public performPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 0

    iget-boolean p1, p0, LMs4;->h:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    :cond_0
    return p1
.end method

.method public reportFullscreenMode(Z)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public requestCursorUpdates(I)Z
    .locals 1

    iget-boolean p1, p0, LMs4;->h:Z

    if-eqz p1, :cond_0

    const-string p1, "RecordingIC"

    const-string v0, "requestCursorUpdates is not supported"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    :cond_0
    return p1
.end method

.method public sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LMs4;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LMs4;->a:Ld32;

    invoke-interface {v0, p1}, Ld32;->a(Landroid/view/KeyEvent;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public setComposingRegion(II)Z
    .locals 2

    iget-boolean v0, p0, LMs4;->h:Z

    if-eqz v0, :cond_0

    new-instance v1, LOv5;

    invoke-direct {v1, p1, p2}, LOv5;-><init>(II)V

    invoke-virtual {p0, v1}, LMs4;->a(LN91;)V

    :cond_0
    return v0
.end method

.method public setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 2

    iget-boolean v0, p0, LMs4;->h:Z

    if-eqz v0, :cond_0

    new-instance v1, LPv5;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p2}, LPv5;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p0, v1}, LMs4;->a(LN91;)V

    :cond_0
    return v0
.end method

.method public setSelection(II)Z
    .locals 1

    iget-boolean v0, p0, LMs4;->h:Z

    if-eqz v0, :cond_0

    new-instance v0, Law5;

    invoke-direct {v0, p1, p2}, Law5;-><init>(II)V

    invoke-virtual {p0, v0}, LMs4;->a(LN91;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method
